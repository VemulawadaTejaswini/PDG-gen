import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final String S = sc.next();
    		String previousString = "";
    		StringBuilder currentString = new StringBuilder();
    		int count = 0;

    		for (int i=0; i<S.length(); i++) {
    			currentString.append(S.charAt(i));
    			if (!previousString.equals(currentString.toString())) {
    				count++;
    				previousString = currentString.toString();
    				currentString = new StringBuilder();
    			}
    		}
    		System.out.println(count);

    	} finally {
    		sc.close();
    	}
    }
}

