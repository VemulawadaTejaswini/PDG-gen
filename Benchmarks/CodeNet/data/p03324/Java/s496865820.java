import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int Num = 0;
		if(N % 100 == 0) {
			Num = (N + 1) * (int)Math.pow(100, D);
		}else {
			Num = N * (int)Math.pow(100, D);
		}
		
		System.out.println(Num);
	}
}
