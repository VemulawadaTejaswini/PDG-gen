
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int[][] A=new int[3][3];
	    boolean[][] F=new boolean[3][3];
	    for (int i=0; i<3;i++) {
	    	for (int j=0; j<3;j++) {
		    	A[i][j]=gi();
		    }
	    }
	    int N=gi();
	    int[] B=new int[N];

	    for (int i=0; i<N;i++) {
	    	B[i]=gi();
	    	for (int j=0; j<3;j++) {
		    	for (int k=0; k<3;k++) {
			    	if(A[j][k]==B[i])F[j][k]=true;
			    }
		    }
	    }
	    
	    boolean bz=false;
	    
	    for (int i=0; i<3;i++) {
            boolean b=true;
		    for (int j=0; i<3;i++) {
		    	if(F[i][j]==false)b=false;
		    }
	    	if(b)bz=true;
	    }
	    
	    for (int i=0; i<3;i++) {
            boolean b=true;
		    for (int j=0; i<3;i++) {
		    	if(F[j][i]==false)b=false;
		    }
	    	if(b)bz=true;
	    }
	    

       //System.out.print((int)Math.floor(Math.sqrt(n)));

        if (bz || (F[0][0]==true && F[1][1]==true && F[2][2]==true) || (F[0][2]==true && F[1][1]==true && F[2][0]==true)) {
    	    System.out.print("Yes");
        }else {
        	System.out.print("No");
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