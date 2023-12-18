import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = sc.nextInt();
		int before = 0;
		int ans = 1;
		for(int i = 1; i < N; i++) {
			int h = sc.nextInt();
			if(max <= h && before <= h) ans++; 
			before = h;
		}
		sc.close();
		System.out.println(ans);
	}
}