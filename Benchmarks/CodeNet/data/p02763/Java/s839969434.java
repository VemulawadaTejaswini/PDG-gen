import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int n = sc.nextInt();
    		final String s = sc.next();
    		StringBuilder sb = new StringBuilder(s);
    		final int q = sc.nextInt();
    		int [] type = new int[q];
    		int [] iq = new int[q];
    		String [] cq = new String[q];
    		for (int i=0; i<q; i++) {
    			type[i] = sc.nextInt();
    			iq[i] = sc.nextInt();
    			cq[i] = sc.next();
    		}

    		for (int i=0; i<q; i++) {
    			if (type[i] == 1) {
    				sb.setCharAt(iq[i]-1, cq[i].charAt(0));
    			} else {
    				int start = iq[i] - 1;
    				int end = Integer.valueOf(cq[i]);
    				HashSet<Character> set = new HashSet<>();
    				for (int j=start; j<end; j++) {
    					set.add(sb.charAt(j));
    				}
    				System.out.println(set.size());
    			}
    		}

    	} finally {
    		sc.close();
    	}
    }
}
