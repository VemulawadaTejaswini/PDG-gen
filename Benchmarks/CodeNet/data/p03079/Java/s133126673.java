import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	try (Scanner in = new Scanner(System.in)) {
    		int[] line = new int[3];
    		
    		for (int i = 0; i < 3; i++) {
    			line[i] = Integer.parseInt(in.next());
    			if (i > 0 && line[i] != line[i-1]) {
    				System.out.println("No");
    				return;
    			}
    		}
    		System.out.println("Yes");
    		
    		
    		
    	} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
