import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader breader = getReader();
		int n = getInt(breader); 
		int[] num = getAry(breader);
		int snum = 0;
		for(int i = 0; i < n ; i++ ) {
			int mini=i;
			for( int j = i+1 ; j < n ; j++ ) {
				if ( num[mini] > num[j] ) {
					mini = j;
				}
			}
			if ( mini != i) {
				int k = num[mini];
				num[mini] = num[i];
				num[i] = k;
				snum++;
			}
		}
		putAry(num);
		System.out.println(snum);
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(System.in)));
	}
	public static int getInt(BufferedReader br)throws Exception {
		String line = br.readLine();
		return Integer.valueOf(line);
	}
	public static int[] getAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		int[] n = new int[nstr.length];
		for( int i=0 ; i < nstr.length ; i++ ) {
			n[i] = Integer.valueOf(nstr[i]);
		}
		return n;
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