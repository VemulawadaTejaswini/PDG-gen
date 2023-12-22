import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int n = scan.nextInt();
		int ans = 1;
		for(int i = n; i > 0; i--){
			ans *= i;
		}
		System.out.printf("%d\n", ans);
	}
}