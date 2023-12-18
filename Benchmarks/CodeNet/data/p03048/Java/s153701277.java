import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(), G = sc.nextInt(), B = sc.nextInt();
		int N = sc.nextInt();
		int res = 0;
		for(int r = 0; r <= 3000; r++) {
			for(int g = 0; g <= 3000; g++) {
				if(N >= (R*r + G*g) && (N - R*r - G*g) % B == 0) res++;
			}
		}
		System.out.println(res);
	}
}
