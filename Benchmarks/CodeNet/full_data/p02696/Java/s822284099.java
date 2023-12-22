import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
		
		for(int i = 1; i <= n; i++) {
			int temp = (int) (Math.floor((a*i)/b)-a*Math.floor(i/b));
			if(temp > ans) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}

}