import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int n = nextInt();
		long[][] rank = new long[n][4];

		for(int i=0;i<n;i++) {
			long[] a = Long_ASCII(next());
			rank[i][0] = a[0];
			rank[i][1] = a[1];
			rank[i][2] = nextLong();
			rank[i][3] = i;
		}
		sc.close();

		Arrays.sort(rank,(a1,a2)->Long.compare(a2[2],a1[2]));
		Arrays.sort(rank,(a1,a2)->Long.compare(a1[1],a2[1]));
		Arrays.sort(rank,(a1,a2)->Long.compare(a1[0],a2[0]));
		//for(int i=0;i<n;i++)out.println(rank[i][0]+" "+rank[i][1]+" "+rank[i][2]);

		for(int i=0;i<n;i++) {
			out.println(rank[i][3]+1);
		}
	}

	//ASCIICodesに変換して結合し返す a[0]:asciiCodes[0]~[8]  a[1]:asciiCodes[9]~[17]
	private long[] Long_ASCII(String s) {
		 byte[] asciiCodes = null;
	        String sampleString = s;
	        try {
	            asciiCodes = sampleString.getBytes("US-ASCII");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        long[] a = new long[2];
	        for (int i=0;i<asciiCodes.length&&i<10-1;i++) {
	        	a[0] *= 100;
	        	a[0] += asciiCodes[i]-85;
	        }
	        if(asciiCodes.length>=10) {
	        	for(int i=9;i<asciiCodes.length;i++) {
	        		a[1] *= 100;
	        		a[1] = asciiCodes[asciiCodes.length-1]-85;
	        	}
	        }
	        while(true) {
	        	if(a[0] > 100_000_000_000_000_000L-1)break;
	        	a[0]*=10;
	        }
		return a;
	}

	private static int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	private static long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}