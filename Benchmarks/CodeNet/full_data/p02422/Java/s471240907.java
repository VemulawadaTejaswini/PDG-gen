import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	String str = sc.next();
    	int q = sc.nextInt();
    	
    	for(i = 0; i < q; i++) {
    		String order = sc.next();
    		if(order.equals("print")) {
    			int pr1 = sc.nextInt();
    			int pr2 = sc.nextInt();
    			
    			System.out.println(str.substring(pr1, pr2 + 1));
    		}
    		if(order.equals("reverse")) {
    			int re1 = sc.nextInt();
    			int re2 = sc.nextInt();
    			
    			StringBuffer sb = new StringBuffer(str.substring(re1, re2 + 1));
    			String re = sb.reverse().toString();
    			str = str.substring(0, re1) + re + str.substring(re2 + 1, str.length());
    		}
    		if(order.equals("replace")) {
    			int rep1 = sc.nextInt();
    			int rep2 = sc.nextInt();
    			String rep3 = sc.next();
    			
    			str = str.substring(0, rep1) + rep3 + str.substring(rep2 + 1, str.length());
    		}
    	}
    }
}
