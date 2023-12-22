import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int n = scan.nextInt();
		int ans = 1;
		for(int i = 1; i <= n; i++){
			ans *= i;
		}
		System.out.printf("%d\n", ans);
	}
}