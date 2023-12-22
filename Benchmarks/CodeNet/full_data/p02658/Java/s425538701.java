import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long judge = (long) Math.pow(10, 18);
		long ans = 1;
		for(int i = 0; i < n; i++) {
			ans *= sc.nextLong();
		}
		if(ans >judge ||ans < 0) {
			System.out.println("-1");
		}
		else {
		System.out.println(ans);
		}
	}
}