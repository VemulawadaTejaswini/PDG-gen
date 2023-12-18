import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N=Integer.parseInt(scanner.next());
	    int Q=Integer.parseInt(scanner.next());
	    String S =scanner.next();
	    int[] L=new int[Q];
	    int[] R=new int[Q];

	    for(int i=0; i<Q;i++) {
	    	L[i]=Integer.parseInt(scanner.next());
	    	R[i]=Integer.parseInt(scanner.next());
	    }

	    for (int i=0; i<Q; i++) {
	    	String s = S.substring(L[i] - 1, R[i]);
	    	if (s.length() < 2) {
	    		System.out.println(0);
	    		continue;
	    	}
	    	int c=0;
	    	for (int j=0; j<s.length() - 1;j++) {
	    		if (s.substring(j, j+2).equals("AC")) {
	    			c++;
	    		}
	    	}
	    	System.out.println(c);
	    }

	}
}