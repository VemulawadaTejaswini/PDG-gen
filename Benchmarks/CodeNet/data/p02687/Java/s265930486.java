
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    int[] H = new int[N];
	    int[] A = new int[M];
	    int[] B = new int[M];
	    boolean[] G = new boolean[N];
	    
	    
	    for (int i=0; i<N;i++) {
	    	H[i]=gi();
	    	G[i]=true;
	    }
	    
	    for (int j=0; j<M;j++) {
	    	A[j]=gi();
	    	B[j]=gi();
	    }
	    
	    for (int j=0; j<M;j++) {
	    	int a=A[j];
	    	int b=B[j];
	    	if(H[a-1]>H[b-1]) {
	    		G[b-1]=false;
	    	} else if(H[b-1]>H[a-1]) {
	    		G[a-1]=false;
	    	} else {
	    		G[a-1]=false;
	    		G[b-1]=false;
	    	}
	    }
	    
	    int c=0;
	    for (int i=0; i<N;i++) {
	    	if(G[i]==true)c++;
	    }
	    



	   
	    System.out.print(c);

//        if (t.equals("Sunny")) {
//        	System.out.print("Cloudy");
//        }else if(t.equals("Cloudy")){
//        	System.out.print("Rainy");
//        } else {
//        	System.out.print("Sunny");
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