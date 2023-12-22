import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";

	    long N = Long.parseLong(scanner.next());
        StringBuilder sb = new StringBuilder();
	    int z = 1;
	    while(true) {
	        if (N < Math.pow(26, z)) {
	            for (int i = 0; i < z; i++) {
	                int index = (int)(N % 26) - 1;
	                sb.insert(0, alphabet.charAt(index));
	                N -= index;
	                N = N / 26;
	            }
	            break;
	        }
	        z++;
	    }

	    System.out.println(sb.toString());
	}

}
