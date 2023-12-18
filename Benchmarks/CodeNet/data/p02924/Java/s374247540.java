import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i;
        }
		System.out.println(ans);
    }
}