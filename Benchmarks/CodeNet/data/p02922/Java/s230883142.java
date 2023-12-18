import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int ans = 1;
		if(a != b) {
			ans = ans + (b/a);
		}else {
			
		}
		
		System.out.println(ans);

	}

}
