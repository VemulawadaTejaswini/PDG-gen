
import java.util.Scanner;
//096C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans =a*x+b*y;;
		
		for (int i=0;i<=2*Math.max(x, y);i++){
			int price=2*i*c+ Math.max(x-i, 0)*a + Math.max(y-i, 0)*b ;
			ans = Math.min(ans, price);
		}
		System.out.println(ans);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}