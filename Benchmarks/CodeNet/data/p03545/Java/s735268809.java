import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String in = sc.next();
    	int A = in.charAt(0) - '0';
    	int B = in.charAt(1) - '0';
    	int C = in.charAt(2) - '0';
    	int D = in.charAt(3) - '0';
    	List<String> op = new ArrayList<>();
    	for (int i = 1; i < Math.pow(2, 3); i++) {
    		String opr = Integer.toString(i, 2);
    		if (opr.length() == 1) {
    			opr = "0" + "0" + opr;
    		} else if (opr.length() == 2) {
    			opr = "0" + opr;
    		}
    		op.add(opr.replace('1', '+').replace('0', '-'));
    	}
    	for (String s : op) {
    		int num = 0;
    		if (s.charAt(0) == '+') {
    			num = A + B;
    		} else {
    			num = A - B;
    		}
    		if (s.charAt(1) == '+') {
    			num += C;
    		} else {
    			num -= C;
    		}
    		if (s.charAt(2) == '+') {
    			num += D;
    		} else {
    			num -= D;
    		}
    		if (num == 7) {
    			System.out.println("" + A + s.charAt(0) + B + s.charAt(1) + C + s.charAt(2) + D + "=7");
    			System.exit(0);
    		}
    	}
    }
}