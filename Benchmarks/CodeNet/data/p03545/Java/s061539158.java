import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = s.length();
		for(int i = 0; i < (1 << n - 1); i++) {
	        long tmp = (int)s.charAt(0) - '0';
	        String result = "" + s.charAt(0);
	        for(int j = 1; j < n; j++) {
		        if((i & (1 << j-1)) != 0) {
		            tmp += (int)s.charAt(j) - '0';
		            if(j!=0)result += "+" + s.charAt(j);
		            else result += s.charAt(j);
	            } else {
	            	tmp -= (int)s.charAt(j) - '0';
		            if(j!=0)result += "-" + s.charAt(j);
		            else result += s.charAt(j);
	            }
		        //System.out.println("i:" + i + ",j:" + j);
		        //System.out.println(result);
		        //System.out.println("tmp:" + tmp);
	        }
	        if(tmp == 7){
	        	System.out.println(result + "=7");
		        break;
	        }
	    }
	}
}
