import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	//static List<Integer> E = new ArrayList<Integer>();
	static int N;
	static int M;
	static int Q;
	static int[] A;
	static int[] B;
	static int[] C;
	static int[] D;
	static int max=0;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    N=gi();
	    M=gi();
	    Q=gi();
	    A=new int[Q];
	    B=new int[Q];
	    C=new int[Q];
	    D=new int[Q];

	    for (int i=0; i<Q; i++) {
	    	A[i]=gi();
	    	B[i]=gi();
	    	C[i]=gi();
	    	D[i]=gi();

	    }

	    List<Integer> E=new ArrayList<Integer>();
	    f(E);
	    	System.out.print(max);

//        if (flg) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
//        }


	}

	public static void f(List<Integer> E) {
		if (E.size()==N) {
			int num=0;
			for (int i=0; i<Q; i++) {
				if(E.get(B[i]-1) - E.get(A[i]-1) == C[i]) {
					num+=D[i];
				}
			}
			if (max<num) {
				max=num;
			}
          return;
		}
		int start=1;
		if(E.size() !=0) {
			start=E.get(E.size() - 1);
		}
		for (int i=start; i<=M; i++) {
			List<Integer> nE=new ArrayList<Integer>();
			nE.addAll(E);
			nE.add(i);
			f(nE);
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