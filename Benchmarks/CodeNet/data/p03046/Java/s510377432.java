import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = 1 << sc.nextInt(), K = sc.nextInt();
		if (K < M && M != 2) {
			for (int i = 0;i < M;++ i) {
				if (i == K) continue;
				System.out.print(i + " ");
			}
			System.out.print(K + " ");
			for (int i = M - 1;i >= 0;-- i) {
				if (i == K) continue;
				System.out.print(i + " ");
			}
			System.out.println(K);
		} else if (M == 2 && K == 0) System.out.println("0 0 1 1"); 
		else System.out.println("-1");
	}
}