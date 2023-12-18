
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int P=gi();

	    int k=0;
	    int g=0;
	    for (int i=0; i<N;i++) {
	    	int a=gi();
	    	if(a%2==0) {
	    		g++;
	    	}else {
	    		k++;
	    	}
	    }
	    long c=0;
	    //System.out.println(Math.max(max-min+1,0));
        long gc=(long)Math.pow(2, g);
        long kc=0;
        int i=0;
        while(i<=k) {
        	if(i%2==P) {
        	    kc+=combi(k,i);
        	}
        	i++;
        }
        c=gc*kc;

        System.out.println(c);
	}
	// ｎ個の中からm個選ぶ組み合わせの数
	public static long combi(long n, long m) {
		if (n<m) return 0;
		long c=Math.min(m, n-m);
		long ckaijo=kaijo(c);
		long v=1;
		while(c!=0) {
			c--;
			v*=n;
			n--;
		}
		return v/ckaijo;
	}

	// ｎ個の中からm個選ぶ組み合わせの数
	public static long kaijo(long n) {
	    if(n<=1) return 1;

	    return n* kaijo(n-1);
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