import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    int n=gi();
	    int m=gi();
	    int[] P=new int[m];
	    boolean[] S=new boolean[m];
	    boolean[] isa=new boolean[n];
	    long pe =0;
	    long ac=0;
	    
for (int i=0; i<n;i++) {
	    	isa[i]=false;
	    }
	    
	    for (int i=0; i<m;i++) {
	    	P[i]=gi();
	    	S[i]=gs().equals("AC");
	    	if (!isa[P[i]-1]) {
	    		if(S[i]) {
	    			ac++;
	    			isa[P[i]-1]=true;
	    		}else {
	    			pe++;
	    		}
	    	}
	    }

	    System.out.print(ac+" "+pe);
//	    if (s.contains("AC")) {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }


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