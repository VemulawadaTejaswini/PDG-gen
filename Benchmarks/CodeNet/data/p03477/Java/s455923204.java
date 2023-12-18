import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String ans;
		if( a + b < c + d) {
			ans = "Right";
		}else if(c + d < a + b) {
			ans = "Left";
		}else {
			ans = "Balanced";
		}
		System.out.print(ans);
	}
	
}