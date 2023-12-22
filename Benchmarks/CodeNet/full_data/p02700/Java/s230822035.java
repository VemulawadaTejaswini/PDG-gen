import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			
			int ans1=0,ans2=0;
			if(a%d==0) {
				ans1=a/d;
			}
			else {
				ans1=a/d+1;
			}
			if(c%b==0) {
				ans2 = c/b;
			}
			else {
				ans2 = c/b+1;
			}
			if(ans1>=ans2) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			

		
		
	}
}