import java.io.*;
import java.util.*;
class Main{
	static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intMax 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int n = saori.saori_hayami();
		int x = saori.saori_hayami();
		int y = saori.saori_hayami();
		DijkstraMatrix dijkst=new DijkstraMatrix(n);
		for (int i = 0; i < n-1; i++){
			dijkst.set(i, i+1, 1);
		}
		dijkst.set(x-1, y-1, 1);
		saori.close();
		int[] ans = new int[n-1];
		for(int i = 0;i < n-1;i++){
			for(int j = i +1 ;j < n;j++){
				int cost = dijkst.getCost(i, j);
				ans[cost-1]++;
			}
		}
		for(int i = 0;i < ans.length;i++){
			System.out.println(ans[i]);
		}
    }
}

class DijkstraMatrix {
	int[][] a;
	boolean[] b;
	PriorityQueue<int[]> q;

	public DijkstraMatrix(int n) {
		a = new int[n + 1][n + 1];
		b = new boolean[n + 1];
		q = new PriorityQueue<int[]>(n + 1, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
	}

	public void set(int i, int j, int cost) {
		a[i][j] = cost;
	}

	public int getCost(int s, int e) {
		Arrays.fill(b, false);
		q.clear();
		b[s] = true;
		for (int i = 1; i < a.length; ++i)
			if (a[s][i] > 0)
				q.add(new int[] { i, a[s][i] });
		int c = 0;
		while (!q.isEmpty()) {
			int[] t = q.poll();
			if (t[0] == e) {
				c = t[1];
				break;
			}
			b[t[0]] = true;
			for (int i = 1; i < a.length; ++i)
				if (!b[i] && a[t[0]][i] > 0)
					q.add(new int[] { i, t[1] + a[t[0]][i] });
		}
		return c;
	}

}

class hayami implements Closeable {
	private final InputStream in = System.in;
	private final byte[] hayami = new byte[1024];
	private int Hayami = 0;
	private int saori = 0;
	private boolean HayamiSaori() {
		if (Hayami < saori) {
			return true;
		}else{
			Hayami = 0;
			try {
				saori = in.read(hayami);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (saori <= 0) {
				return false;
			}
		}
		return true;
	}
	private int SaoriHayami() { 
		if (HayamiSaori()) {
            return hayami[Hayami++];
         }else{
             return -1;
         }
	}
	private static boolean hayami_saori(int hayami) { 
		return 33 <= hayami && hayami <= 126;
	}
	public boolean hayamisaori() { 
		while(HayamiSaori() && !hayami_saori(hayami[Hayami])) Hayami++; return HayamiSaori();
	}
	public String nextHayami() {
		if (!hayamisaori()) throw new NoSuchElementException();
		StringBuilder hayamin = new StringBuilder();
		int saori = SaoriHayami();
		while(hayami_saori(saori)) {
			hayamin.appendCodePoint(saori);
			saori = SaoriHayami();
		}
		return hayamin.toString();
	}
	public long saorihayami() {//nextLong
		if (!hayamisaori()) throw new NoSuchElementException();
		long hayami = 0;
		boolean misao = false;
		int saori = SaoriHayami();
		if (saori == '-') {
			misao = true;
			saori = SaoriHayami();
		}
		if (saori < '0' || '9' < saori) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= saori && saori <= '9') {
				hayami *= 10;
				hayami += saori - '0';
			}else if(saori == -1 || !hayami_saori(saori)){
				return misao ? -hayami : hayami;
			}else{
				throw new NumberFormatException();
			}
			saori = SaoriHayami();
		}
	}
	public int saori_hayami() {//nextInt
		long hayami = saorihayami();
		if (hayami < Integer.MIN_VALUE || hayami > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) hayami;
	}
	public double Hayamin() { //nextDouble
		return Double.parseDouble(nextHayami());
	}
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
		}
    }
    
}