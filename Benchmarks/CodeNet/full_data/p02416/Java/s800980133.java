import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
		    String x = in.next();
		    if (x.equals("0")) {
		    	break;
		    }
		    char[] chars = x.toCharArray();
		    int sum = 0;
		    for (char c : chars) {
			    sum += Character.getNumericValue(c);
		    }
		    System.out.println(sum);
		}
	}
}	
