
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static long[][] dp;
    static int ind=1;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int m=gi();
        long k=gi();
        long[] A = new long[n];
        long[] B=new long[m];

        for (int i=0; i< n;i++) {
        	A[i]=gl();
        }
        for (int i=0; i< m;i++) {
        	B[i]=gl();
        }
        long t=k;
        long s=0;
        long max=0;
        int ai=0;
        int bi=0;
        for (int i=0; i< n;i++) {
        	if(t>=A[i]) {
        		t-=A[i];
        		s++;
        		ai=i;
        	} else {
        		break;
        	}
        }
        for (int i=0; i< m;i++) {
        	if(t>=B[i]) {
        		t-=B[i];
        		s++;
        		bi=i;
        	} else {
        		break;
        	}
        }
        max=s;


        while(ai>=0) {
        	t+=A[ai];
        	ai--;
        	s--;
        	while(bi+1<m) {
        		if(t>=B[bi+1]) {
        			bi++;
        			t-=B[bi];
        			s++;
        		} else {
        			break;
        		}
        	}
        	if(s>max) {
        		max=s;
        	}
        	if(bi+1>=m) break;
        }


        System.out.println(max);
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