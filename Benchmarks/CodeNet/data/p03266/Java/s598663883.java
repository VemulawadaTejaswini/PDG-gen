import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int ans = n / k;
        if(k % 2 == 0) {
            int b = n / (k / 2);
            int c = b - ans;
            ans += c*c*c;
        }
        System.out.println(ans);
	}
}