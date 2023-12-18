
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int nnn = 0;
		int ans = 0;
		for (int i = 1; i <= 9; i++) {
			nnn = i + (i * 10) + (i* 100); 
			if(n <= nnn) {
				ans = nnn; 
				break;
			}
		}
		System.out.println(nnn);
		
	}
}