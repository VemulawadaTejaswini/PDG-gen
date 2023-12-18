import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		int K = sc.nextInt();
    		StringBuilder S = new StringBuilder(sc.next());

    		while (K > 0) {
    			StringBuilder T = new StringBuilder(S.toString());
    			T.reverse();
    			StringBuilder revU = new StringBuilder(S.toString() + T.toString());
    			revU.reverse();
    			String sDash = S.toString();
    			for (int i=0; i<=N; i++) {
    				String tmp = revU.substring(i, i+N);
    				if (sDash.compareTo(tmp) > 0) {
    					sDash = tmp;
    				}
    			}
    			K--;
    			S = new StringBuilder(sDash);
    			S.reverse();
    		}
    		System.out.println(S.reverse());

    	} finally {
    		sc.close();
    	}
    }
}

