
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    int M=gi();
	    int[] a=new int[A];
	    int[] b=new int[B];

	    int ma=Integer.MAX_VALUE;
	    int mb=Integer.MAX_VALUE;
	    for (int i=0; i<A;i++) {
	    	a[i]=gi();
	    	if(ma>a[i])ma=a[i];
	    }
	    for (int i=0; i<B;i++) {
	    	b[i]=gi();
	    	if(mb>b[i])mb=b[i];
	    }
	    int min=ma+mb;
	    for (int i=0; i<M;i++) {
	    	int x=gi();
	    	int y=gi();
	    	int c=gi();
	    	int q=a[x-1]+b[y-1]-c;
	    	if(min>q)min=q;
	    }
//	    if (N<M) {
//	    	System.out.println("X");
//	    } else if (N>M) {
//	    	System.out.println("Y");
//	    }
	    System.out.println(min);
	}

	// s進数で表した時の桁数
	public static int NsinKeta(int n, int s) {
		if(n==0) return 1;

		int i=0;
		while(n!=0) {
			n=Math.floorDiv(n, s);
			i++;
		}

		return i;
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