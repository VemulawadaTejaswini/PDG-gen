import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P[] = new int[N];
		int sum = 1;
		boolean flag = true;
		for(int i=0; i < N; i++) {
		int b = scan.nextInt();
		P[i] = b;
		}

		for(int i=1; i<N; i++) {
			for(int j=1; j<i+1; j++) {
			flag = true;
			if(P[i] > P[j-1]) {
				flag = false;
			}
		}
			if(flag == true) {
				sum += 1;
			}
		}
		System.out.print(sum);

	}

}
