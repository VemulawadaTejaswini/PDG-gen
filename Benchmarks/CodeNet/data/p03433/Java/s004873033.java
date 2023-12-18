import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //支払いたい金額
		int a = stdIn.nextInt(); //1円の枚数
		
		int ans = n % 500;
		
		if(ans <= a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
	}

}
