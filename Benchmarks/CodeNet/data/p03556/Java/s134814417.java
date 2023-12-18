import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		int ans = 0;
		while (true) {
			ans = i*i;
			if (n < (i+1)*(i+1)) {
				break;
			}
			i++;
		}
		System.out.println(ans);
	}
}
