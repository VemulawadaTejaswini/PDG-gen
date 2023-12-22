import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if((a * a + b * b) == c * c) {
				System.out.println("YES");
			}
			else if((b * b + c * c) == a * a) {
				System.out.println("YES");
			}
			else if((c * c + a * a) == b * b) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}