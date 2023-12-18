

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[][] A=new int[2][N];

        for(int i=0; i<2;i++) {
        	for(int j=0; j<N;j++) {
                A[i][j]=gi();
            }
        }

        int max=A[0][0];
        for(int i=0; i<N;i++) {
            max+=A[1][i];
        }
        
        int t=max;
        for(int i=1; i<N;i++) {
            t=t-A[1][i-1] + A[0][i];
            if(t>max) {
            	max=t;
            }
        }

	    System.out.print(max);
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