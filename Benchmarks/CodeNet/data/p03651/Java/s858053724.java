
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int k=gi();
	    long[] A=new long[n];

        for(int i=0; i<n;i++) {
        	A[i]=gl();
        }

        Arrays.parallelSort(A);
        long m=A[0];
        for(int i=1; i<n;i++) {
        	m=uclid(m, A[i]);
        	if(m==1)break;
        }


        if(k%m==0 && k<=A[n-1]) {
		    System.out.println("POSSIBLE");
        } else {
        	System.out.println("IMPOSSIBLE");
        }
	}

	 // ユークリッドの互除法
    public static long uclid(long m, long n) {
    	if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			long t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
    }
	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}