

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
        int[] D=new int[K];
        boolean[] F=new boolean[N];
        for (int i=0; i<N; i++) {
        	F[i]=true;
        }
        for (int i=0; i<K;i++) {
        	D[i]=gi();
        	for (int j=0; j<D[i];j++) { 
        		int a=gi();
        		F[a-1]=false;
        	}
        }
        int c=0;
        for (int i=0; i<N; i++) {
        	if(F[i])c++;
        }


        System.out.print(c);

//        if (N%2==0 && s.substring(0, N/2).equals(s.substring(N/2))) {
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
//        }
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