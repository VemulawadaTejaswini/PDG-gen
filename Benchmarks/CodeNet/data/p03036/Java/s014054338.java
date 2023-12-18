import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int r = sc.nextInt();
			int d = sc.nextInt();
			int x[] = new int[11];
			x[0] = sc.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				x[i] = r * x[i-1] - d;
				System.out.println(x[i]);
			}
		}
	}
}
