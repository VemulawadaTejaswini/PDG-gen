import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] P = new int[N];
		int i = 0;
		while(i < N) {
			P[i] = sc.nextInt();
			i++;
		}

		int counter = 1;
		int min = P[0];
		for(i = 1; i < N;i++) {
			if(P[i]<min) {
				min = P[i];
				counter++;
			}
		}

		System.out.println(counter);
	}

}
