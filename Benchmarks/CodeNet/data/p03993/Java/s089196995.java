import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
                Scanner sc = new Scanner(System.in);
		try {
                // get a integer
		int a = sc.nextInt();
		// get two integers separated with half-width break
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt() - 1;
		}
               
		int count = 0;
			
		for (int i = 0; i < a; i++) {
			if ( i < b[i] && (b[b[i]] == i) )
				count++;
		}
				
		System.out.println(count);
                
		}
        catch (NoSuchElementException e) {
             e.printStackTrace();
        }
 
	}
}