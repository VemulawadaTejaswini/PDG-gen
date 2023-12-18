import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		for (int i=X; 0<i; i--) {
			int t = (int)Math.sqrt(i);
			if (i==Math.pow(t, 2)) {
				System.out.println(i);
				return;
			}
		}
	}
}
