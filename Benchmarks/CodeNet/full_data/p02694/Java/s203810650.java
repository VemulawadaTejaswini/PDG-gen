import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X= keyboard.nextInt();
		int ans = 0;
		int x = 100;

		while(x < X ) {
			x = x*101/100;
			ans++;
		}
		
		System.out.println(ans);
		keyboard.close();	
		
	}
}
