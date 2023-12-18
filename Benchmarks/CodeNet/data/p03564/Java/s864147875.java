import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int ans = 1;

		for(int i = 0; i < n; i++){
			if(ans < k){
				ans *= 2;
			}else {
				ans += k;
			}
		}
		System.out.println(ans);
	}
}