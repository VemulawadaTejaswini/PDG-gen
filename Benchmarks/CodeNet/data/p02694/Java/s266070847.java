import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long X= keyboard.nextLong();
                System.out.println(X);
		int ans = 0;
		long x = 100;

		while(x < X ) {
			x += x/100;
			ans++;
		}
		
		System.out.println(ans);
		keyboard.close();	
		
	}
}
