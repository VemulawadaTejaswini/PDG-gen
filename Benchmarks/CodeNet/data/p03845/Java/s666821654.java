import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		for(int i = 0;i < N;++i)
			T[i] = sc.nextInt();
		int M = sc.nextInt();
		int[][] drink = new int[M][2];
		for(int i = 0;i < M;++i) {
			drink[i][0] = sc.nextInt();
			drink[i][1] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		for(int i = 0;i < N;++i)
			sum += T[i];
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < M;++i)
			sb.append((sum + (drink[i][1] - T[drink[i][0]-1])) + "\n");
		System.out.println(sb.toString());
	}
}
