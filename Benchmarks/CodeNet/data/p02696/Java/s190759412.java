import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long ans = 0;
		
		for(int i = 1; i <= n; i++) {
			long temp = (long) (Math.floor((a*i)/b)-a*Math.floor(i/b));
			if(temp > ans) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}

}