import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), m = s.nextInt(), g = s.nextInt();
    	if (Math.sqrt(n) + Math.sqrt(m) < Math.sqrt(g)) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    	}
    }
