import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";

	    long N = Long.parseLong(scanner.next());
        StringBuilder sb = new StringBuilder();
	    int z = 1;
	    while(true) {
	    	double sum = Main.getValue(z);
	        if (N <= sum) {
	            for (int i = 0; i < z; i++) {
	                int index = (int)(N % 26);
	                if (index > 0) {
	                    sb.insert(0, alphabet.charAt(index - 1));
	                    N -= index - 1;
	                } else {
	                	sb.insert(0, alphabet.charAt(25));
	                	N -= 25;
	                }

	                N = N / 26;
	            }
	            break;
	        }
	        z++;
	    }

	    System.out.println(sb.toString());
	}

	public static double getValue(int z) {
	   double sum = 0;
		for (int i = 0; i < z; i++) {
		    sum += Math.pow(26, i+1);
		}
		return sum;
	}

}