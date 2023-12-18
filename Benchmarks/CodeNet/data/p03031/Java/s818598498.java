
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    int[][] S=new int[M][N];
	    int[] k=new int[M];
	    int[] p=new int[M];

	    for (int i=0; i<M;i++) {
	    	k[i]=gi();
	    	for (int j=0; j<k[i];j++) {
	    		S[i][j]=gi();
	    	}
	    }
	    for (int i=0; i<M;i++) {
	    	p[i]=gi();
	    }
	    
	    int c=0;
	    for (int i=0; i<Math.pow(2, N);i++) {
	    	boolean f=true;
	    	for (int j=0; j<M;j++) {
	    		int q=0;
	    		for (int l=0; l<k[j];l++) {
	    			if((i>>(S[j][l]-1) & 1)==1) q++;
	    		}
	    		if(q%2!=p[j]) {
	    			f=false;
	    			break;
	    		}
	    	}
	    	if(f)c++;
	    }

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