

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int W=gi();
	    int[][] c=new int[10][10];
	    int[][] A=new int[H][W];

	    for (int i=0; i<10;i++) {
	    	for (int j=0; j<10;j++) {
		    	c[i][j]=gi();
		    }
	    }
	    for (int i=0; i<H;i++) {
	    	for (int j=0; j<W;j++) {
		    	A[i][j]=gi();
		    }
	    }

	    for (int i=0; i<10;i++) {
	    	for (int j=0; j<10;j++) {
	    		for (int k=0; k<10;k++) {
                    c[j][k]=Math.min(c[j][k], c[j][i]+c[i][k]);
	    	    }
		    }
	    }

	    int ans=0;
	    for (int i=0; i<H;i++) {
	    	for (int j=0; j<W;j++) {
	    		int a=A[i][j];
	    		if(a!=-1)ans+=c[a][1];
		    }
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