
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int blue = n/(a+b)*a;
		int rem = n/(a*b);
		blue += Math.min(a,rem );
		System.out.println(blue);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		}
		//----------------------------------------
		//メソッド置き場
		
		//----------------------------------------
	}