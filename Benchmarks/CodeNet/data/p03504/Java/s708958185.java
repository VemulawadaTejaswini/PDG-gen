
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int C=gi();
	    double[] S=new double[N];
	    int[] T=new int[N];
	    int[] c=new int[N];
	    int[] A=new int[200001];

	    for (int i=0; i<N;i++) {
	    	S[i]=gd()-0.5;
	    	T[i]=gi();
	    	c[i]=gi();
	    	for(double j=S[i]*2; j<T[i]*2;j++) {
	    		A[(int)j]++;
	    	}
	    }

	    int ans=0;
	    for (int i=1; i<A.length;i++) {
            ans=Math.max(ans, A[i]);
	    }

        System.out.println(ans);
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