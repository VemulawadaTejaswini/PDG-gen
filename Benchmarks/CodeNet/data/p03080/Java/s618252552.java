import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	try (Scanner in = new Scanner(System.in)) {
    		int N = Integer.parseInt(in.next());
    		char[] s = in.next().toCharArray();
    		int redCounter = 0;
    		int blueCounter = 0;
    		
    		for (int i = 0; i < N; i++) {
    			if (s[i] == 'R') redCounter++;
    				else blueCounter++;
    		}
    		
    		if (blueCounter < redCounter) System.out.println("Yes");
    		else System.out.println("No");
    		
    		
    	} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
