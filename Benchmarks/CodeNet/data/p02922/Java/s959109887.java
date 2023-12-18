import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int count = 0;
		int ans = 0;
		while (true) {
			if (count < B ) {
				count = count + A-1;
				ans++;
				if (count == B-1) {
					break;
				}
			}
			else {
				break;
			}
		}
		System.out.println(ans);
		
		
	}

}
