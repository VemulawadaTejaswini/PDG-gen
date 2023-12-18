import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		int K = sc.nextInt();
    		StringBuilder S = new StringBuilder(sc.next());
    		boolean firstTime = true;
    		int step = 1;

    		while (K > 0) {
    			StringBuilder T = new StringBuilder(S.toString());
    			T.reverse();
    			StringBuilder revU = new StringBuilder(S.toString() + T.toString());
    			revU.reverse();
    			String sDash = S.toString();
    			for (int i=N; i>=0; i-=step) {
    				String tmp = revU.substring(i, i+N);
    				if (sDash.compareTo(tmp) > 0) {
    					sDash = tmp;
    				} else {
    					if (!firstTime) {
        					break;
    					}
    				}
    			}
				if (firstTime) {
					firstTime = false;
				} else {
					step += step;
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

