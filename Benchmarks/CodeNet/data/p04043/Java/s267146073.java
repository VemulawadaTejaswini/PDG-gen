import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		
		
		if(a == 5 && b == 5 && c == 7 || b == 5 && c == 5 && a == 7|| c == 5 && a == 5 && b == 7 ) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
	}

}
