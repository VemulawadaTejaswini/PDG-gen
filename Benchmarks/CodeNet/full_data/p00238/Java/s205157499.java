
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int t = s.nextInt();
			if(t == 0) {
				break;
			}
			int n = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				b[i] = s.nextInt();
			}
			int c = 0;
			for(int i = 0; i < n; i++) {
				c += b[i] - a[i];
			}
			if(c >= t) {
				System.out.println("OK");
			}
			else {
				System.out.println(t-c);
			}
		}
	}
}