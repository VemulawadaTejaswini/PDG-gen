import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int but1 = sc.nextInt();
		int but2 = sc.nextInt();
		
		int ans = 0;
		if(but1 >= but2) {
			ans += but1;
			but1--;
		} else {
			ans += but2;
			but2--;
		}
		if(but1 >= but2) {
			ans += but1;
			but1--;
		} else {
			ans += but2;
			but2--;
		}
		
		System.out.println(ans);
	}
	
}