import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer>[] list;

	static int[] counter;

	static boolean[] flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int N = Integer.parseInt(sc.next());
//		int Q = Integer.parseInt(sc.next());

		FastScanner fc = new FastScanner();
		int N = fc.nextInt();
		int Q = fc.nextInt();

		list = new ArrayList[N + 1];
		for(int i = 1;i <= N;i++) {
			list[i] = new ArrayList<Integer>();
		}

		for(int i = 1;i <= N - 1;i++) {
			int a = fc.nextInt();
			int b = fc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}

		counter = new int[N + 1];
		for(int i = 1;i <= Q;i++) {
			int p = fc.nextInt();
			int x = fc.nextInt();
			counter[p] += x;
		}
		sc.close();

//		for(int i = 1;i <= N - 1;i++) {
//			System.out.println(list[i]);
//		}
//		for(int i = 1;i <= N;i++) {
//			System.out.println(counter[i]);
//		}

		flag = new boolean[N + 1];
		flag[1] = true;
		dfs(1);

		for(int i = 1;i <= N;i++) {
			System.out.println(counter[i]);
		}

	}

	private static void dfs(int x) {
		for(int y : list[x]) {
//			System.out.print(y);
//			System.out.println(flag[y]);
			if(!flag[y]) {
//				System.out.print(y);
//				System.out.println(counter[y]);
				counter[y] += counter[x];
				flag[y] = true;
				dfs(y);
			}
		}
	}
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}