import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0;
		for(int i = 0;i < N;i++) {
			int A = sc.nextInt();
			for(int k = 0;k < D;k++) {
				if(k * A + 1 <= D)sum += 1;
				else continue;
			}
		}
		
		sum = sum + X;
		System.out.println(sum);
	}

}
