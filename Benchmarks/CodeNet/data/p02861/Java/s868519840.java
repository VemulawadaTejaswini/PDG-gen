import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
    static int N;
    static int[] X;
    static int[] Y;
    static double d=0;
    static double c=0;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    N=gi();
        X=new int[N];
        Y=new int[N];
        for (int i=0; i<N;i++) {
	        X[i]=gi();
	        Y[i]=gi();
	    }

        List<Integer> l2=new ArrayList<Integer>();
        f(l2);
	    System.out.print(d/c);
//	    if (s.contains("AC")) {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }


	}
	
	public static void f(List<Integer> l) {
		if(l.size()==N) {
			for (int i=0; i<N-1;i++) {
				d+=Math.sqrt(Math.pow(X[l.get(i+1)] - X[l.get(i)], 2) + Math.pow(Y[l.get(i+1)] - Y[l.get(i)], 2));
			}
			c++;
			return;
		}
		
		for (int i=0; i<N; i++) {
			if(!l.contains(i)) {
				List<Integer> l2=new ArrayList<Integer>();
				l2.addAll(l);
				l2.add(i);
				f(l2);
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