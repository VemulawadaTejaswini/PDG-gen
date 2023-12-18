
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int blue = n/(a+b);
		int plusBlue = Math.min(a, n%(a+b));
		System.out.println((a*blue)+plusBlue);
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		}
		//----------------------------------------
		//メソッド置き場
		
		//----------------------------------------
	}