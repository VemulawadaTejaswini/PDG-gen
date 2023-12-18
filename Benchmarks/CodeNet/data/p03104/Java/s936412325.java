import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		ans = a ^ (a + 1);
		for(int i = a + 1; i < b; i++){
			ans = ans ^ (i + 1);
		}
		
		System.out.println(ans);
	}
}
