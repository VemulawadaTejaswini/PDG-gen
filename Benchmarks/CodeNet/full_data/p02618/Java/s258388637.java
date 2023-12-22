
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Introduction to Heuristics Contest
 * @author tsukammo
 */
public class Main {

	// only call
	public static void main(String[] args) throws IOException {
		if (submit) {
			out = new PrintWriter(System.out);
		} else {
			out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		}
		new Main().run();
		out.flush();
	}

	// variables
	int D, T;
	int[] c;
	int[][] s;
	int[] preOpen;
	Node ans;
	Set<Integer> loopCheck = new HashSet<>();

	int[] dx = new int[] { 0, 0, -1, 1 };
	int[] dy = new int[] { -1, 1, 0, 0 };
	int[] dxR = new int[] { 0, 0, 1, -1 };
	int[] dyR = new int[] { 1, -1, 0, 0 };
	int[] dR = new int[] { 1, 0, 3, 2 };

	void run() {
		input();
		init();
		solve();
		output();
	}

	long timeLimit = 2_900;

	void solve() {
		Node now = new Node(D);
		now.eval();
		int trueScore = now.score;
		ans = now;
		System.err.println("first=" + now.score);
		now.evalTmp(null);
		int tmpScore = now.score;
		int checkSum = 0;
		for (int i = 0; i < T; i++) {
			checkSum += now.scoreC[i];
		}
		System.err.println("tmpScore=" + now.score + " " + checkSum);
		long currentTime = System.currentTimeMillis();
		int loopCount = 0;
		double forceLine;
		while (currentTime < et) {
			loopCount++;
			int cd = rnd.nextInt(D);
			int ct = rnd.nextInt(T);
			while(now.contests[cd] == ct) {
				cd = rnd.nextInt(D);
				ct = rnd.nextInt(T);
			}
			tmpScore = now.evalChange(cd, ct);

			currentTime = System.currentTimeMillis();
			forceLine = (et - currentTime) / C;
			if (trueScore <= tmpScore || forceLine > rnd.nextDouble()) {
				trueScore = tmpScore;
				now.stateChange(cd, ct);
				now.eval();
				if(trueScore != now.score) {
					System.err.println(loopCount);
				}
			} else {
				// rollback
			}
		}
		checkSum = 0;
		for (int i = 0; i < T; i++) {
			checkSum += now.scoreC[i];
		}
		ans.eval();
		System.err.println("final=" + ans.score + " " + trueScore + " " + checkSum);
		System.err.println("loop=" + loopCount);
		System.err.println("solve END.");
	}

	void output() {
		for (int i = 0; i < D; i++) {
			out.println(ans.contests[i] + 1);
		}
	}

	char getCharD(byte d) {
		switch (d) {
		case 0:
			return 'U';
		case 1:
			return 'D';
		case 2:
			return 'L';
		case 3:
			return 'R';

		default:
			break;
		}
		return '_';
	}

	/**
	 * 計算用に編集
	 */
	void init() {
		preOpen = new int[T];
	}

	/**
	 * 素直に持つ
	 */
	void input() {
		D = in.nextInt();
		st = System.currentTimeMillis();
		et = st + timeLimit;
		T = 26;
		c = new int[T];
		for (int i = 0; i < T; i++) {
			c[i] = in.nextInt();
		}
		s = new int[D][T];
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < T; j++) {
				s[i][j] = in.nextInt();
			}
		}
		System.err.println("input END.");
	}

	// param
	final byte GOAL = -9;
	final byte NONE = -1;
	final byte INF = 100;
	final byte BLOCK = 111;
	final long C = TL * 10_000;
	final int X = 1000; // 厳密な精度は不要と考え、小数点以下を簡略化するための桁増し。
	final int SCORE_D = -10;
	final int SCORE_D2 = -9;
	final int SCORE_C = 1;
	final int SCORE_R = 1000;
	final int SPEED_CAR = 250;
	final int SPEED_DOLLY = 100;
	final int PRIME_TIME_LIMIT = 240;
	final int ROLLY_LIMIT = 10;
	final int POINT_DELIVERY = 10000;
	final int M2S = 60;
	int TIME_LIMIT;
	int TIME_LIMIT_2;

	// predefined
	FastScanner in = new FastScanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static final String FILE_PATH = ".\\";
	static File file = new File(FILE_PATH + "result.out");
	long st = 0, et = 0;
	public Random rnd = new Random(19881221L);

	ArrayList<Integer> list = new ArrayList<>();
	ArrayDeque<P> q = new ArrayDeque<>();
	ArrayDeque<P> q2 = new ArrayDeque<>();

	// 2D-map
	final int[] dw = new int[] { 0, 1, 0, -1, 1, 1, -1, -1 };
	final int[] dh = new int[] { 1, 0, -1, 0, 1, -1, 1, -1 };

	// search
	PriorityQueue<Node> pq = new PriorityQueue<>();

	int[] preDay = new int[] { -1, -1 };

	class Node implements Comparable<Node> {

		int score;
		int[] scoreC;
		int[] contests;

		public Node(int N) {
			this.score = 0;
			scoreC = new int[T];
			contests = new int[N];
			for (int i = 0; i < contests.length; i++) {
				// 初期解
				contests[i] = rnd.nextInt(T);
			}
			// TODO
			/*
			contests[0] = 0;
			contests[1] = 16;
			contests[2] = 12;
			contests[3] = 13;
			contests[4] = 12;
			*/
		}

		public int evalChange(int cd, int ct) {
			int ret = this.score;
			int before = this.contests[cd];
			ret -= this.scoreC[before];
			ret -= this.scoreC[ct];
			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (i == cd) {
					ret += s[i][ct];
					preDay[1] = i;
				} else {
					if (t == before) {
						ret += s[i][t];
						preDay[0] = i;
					} else if (t == ct) {
						ret += s[i][t];
						preDay[1] = i;
					}
				}
				ret -= c[before] * (i - preDay[0]);
				ret -= c[ct] * (i - preDay[1]);
			}
			return ret;
		}

		public void stateChange(int cd, int ct) {
			int before = this.contests[cd];
			this.contests[cd] = ct;
			this.scoreC[before] = 0;
			this.scoreC[ct] = 0;

			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (t == before) {
					this.scoreC[before] += s[i][t];
					preDay[0] = i;
				} else if (t == ct) {
					this.scoreC[ct]  += s[i][t];
					preDay[1] = i;
				}
				this.scoreC[before] -= c[before] * (i - preDay[0]);
				this.scoreC[ct]  -= c[ct] * (i - preDay[1]);
			}
		}

		public Node(Node n) {
			this.score = n.score;
			this.contests = Arrays.copyOf(n.contests, D);
		}

		public int eval() {
			this.score = 0;
			Arrays.fill(scoreC, 0);
			Arrays.fill(preOpen, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				score += s[i][t];
				scoreC[t] += s[i][t];
				preOpen[t] = i;
				for (int j = 0; j < T; j++) {
					int tmp = c[j] * (i - preOpen[j]);
					score -= tmp;
					scoreC[j] -= tmp;
				}
			}
			return this.score;
		}

		public void evalTmp(byte[][][] nowStep) {
			// TODO
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.score, o.score);
		}

	}

	int valid(int p) {
		if (p == -1) {
			return D - 1;
		}
		if (p == D) {
			return 0;
		}
		return p;
	}

	int changeD(int d, byte b) {
		switch (b) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		default:
			break;
		}
		return d;
	}

	// object
	class P {
		int y, x;

		public P(int y, int x) {
			this.y = y;
			this.x = x;
		}

		public P(P p) {
			this.y = p.y;
			this.x = p.x;
		}

		P nextP(int d) {
			int ny = valid(y + dy[d]);
			int nx = valid(x + dx[d]);
			return new P(ny, nx);
		}

		public String toString() {
			return y + " " + x;
		}
	}

	class D {
		P p;
		byte d;

		public D(P p, int d) {
			this.p = p;
			this.d = (byte) d;
		}

		public D(D d) {
			this.p = new P(d.p);
			this.d = d.d;
		}

		public String toString() {
			return p.y + " " + p.x + " " + d;
		}
	}

	// library
	class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		FastScanner(InputStream in) {
			this.in = in;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	class Random {
		private long seed;
		private final long multiplier = 0x5DEECE66DL, addend = 0xBL, mask = (1L << 48) - 1;
		int bits, val;

		Random(long seed) {
			this.seed = seed;
		}

		int nextInt(int n) {
			do {
				bits = (int) ((seed = (seed * multiplier + addend) & mask) >>> 17);
				val = bits % n;
			} while (bits - val + (n - 1) < 0);
			return val;
		}

		double nextDouble() {
			return nextInt(10000000) / 10000000.0;
		}
	}

	static long TL = 1000;
	static boolean submit = true;
}