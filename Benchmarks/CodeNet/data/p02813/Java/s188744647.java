import java.util.Scanner;

public class Main {

	static int N=0;
	static int a=0;
	static int b=0;
	static int c = 0;
	static String P;
	static String Q;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    N = Integer.parseInt(scanner.next());
	    StringBuilder p = new StringBuilder();
	    StringBuilder q = new StringBuilder();
	    
	    for (int i=0; i<N; i++) {
	    	p.append(Integer.parseInt(scanner.next()));
	    }
	    P=p.toString();
	    for (int i=0; i<N; i++) {
	    	q.append(Integer.parseInt(scanner.next()));
	    }
	    Q=q.toString();
        f("");
        System.out.print(Math.abs(a - b));
	}
	
	public static void f(String s) {
		if (s.length() == N) {
			c++;
		    if (s.equals(P)) {
			    a = c;
		    }
		    if (s.equals(Q)) {
			    b = c;
	    	}
		    return;
		}
		for (int i = 1; i <= N; i++) {
		    if (!s.contains(String.valueOf(i))) {
		        f(s + String.valueOf(i));
		    }
		}
	}
}
