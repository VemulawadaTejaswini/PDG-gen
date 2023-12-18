import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sum = 0;
		
		//　整数列を逆数にして合計
		for(int i = 1; i <= N; i++) {
			sum += 1 / sc.nextDouble();
		}
		
		System.out.println(1 / sum);
		sc.close();
	}
}
