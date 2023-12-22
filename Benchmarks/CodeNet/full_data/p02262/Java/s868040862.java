import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	static int count=0;

	public static void main(String[] args) throws Exception {
		BufferedReader breader = getReader();
//		int[] g = getIntAry(breader);
//		int[] num = { 20, 5, 12, 1, 23, 15, 19, 24, 4, 22, 11, 3, 2, 18, 21, 13, 7, 25, 9, 14, 8, 10, 6, 16, 17 };
		int[] num = getAryMl(breader);
		int len = (int)(Math.log(num.length)/Math.log(2));
		if ( len == 0 ) len = 1;
		int[] g = new int[len];
		if ( num.length == 1) {
			g[0] = 1;
		} else {
			g[0] = (int)(num.length/2);
		}
		for(int i = 1 ; i < len ; i++) {
			g[i] = (int)(g[i-1]/2);
		}
		for(int i = 0 ; i < g.length ; i++) {
			insertionSort( num, num.length, g[i]);
		}
		System.out.println(len);
		putAry(g);
		System.out.println(count);
		for( int i = 0 ; i < num.length ; i++) {
			System.out.println(num[i]);
		}
	}
	public static void insertionSort(int[] A, int n, int g) {
		for( int i= g ; i < n ; i++) {
			int v = A[i];
			int j = i - g;
			while( j >= 0 && A[j] > v) {
				A[j+g] = A[j];
				j = j-g;
				count++;
//				putAry(A,n);
			}
			A[j+g] = v;
//			putAry(A,n);
		}
//		System.out.println( "---" + count + " g=" + g);

	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(System.in)));
	}
	public static int getInt(BufferedReader br)throws Exception {
		String line = br.readLine();
		return Integer.valueOf(line);
	}
	public static String[] getAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		return nstr;
	}
	public static int[] getIntAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		int[] n = new int[nstr.length];
		for( int i=0 ; i < nstr.length ; i++ ) {
			n[i] = Integer.valueOf(nstr[i]);
		}
		return n;
	}
	public static int cardComp(String left, String right) {
		char l = left.charAt(1);
		char r = right.charAt(1);
		return(l-r);
	}
	public static int[] getAryMl(BufferedReader br)throws Exception {
		int n = getInt(br);
		int[] ary = new int[n];
		for( int i=0 ; i < n ; i++ ) {
			ary[i] = getInt(br);
		}
		return ary;
	}
	public static void putAry(int[] ary, int num) {
		for( int i = 0; i < num ; i++ ) {
			System.out.print(ary[i]);
			if ( i < num-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	public static void putAry(int[] ary) {
		putAry(ary, ary.length ) ;
	}
	public static boolean isPrime(int n) {
		int r = (int)Math.sqrt((double)n)+1;
		for( int j = 2 ; j < r ; j += 1) {
			if ( n%j == 0 ) {
				return false;
			}
		}
		return true;
	}

	

}