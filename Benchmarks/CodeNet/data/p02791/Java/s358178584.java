import java.util.Scanner;

public class Test_c	 {

	public static void Main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P[] = new int[N];
		int sum = 1;
		boolean flag = true;
		for(int i=0; i < N; i++) {
		P[i] = scan.nextInt();
		}
		int pre_min = P[0];


		for(int i=1; i<N; i++) {
			for(int j=1; j<i+1; j++) {
			flag = true;
			if(P[i] > pre_min) {
				flag = false;
				break;
			}
			/*
			if(P[i] > P[j-1]) {
				flag = false;
				break;
			}

			if(P[i] == 0) {
				flag = true;
				break;
			}
			*/
		}
			if(flag == true) {
				sum += 1;
				pre_min = P[i];
			}
		}
		System.out.print(sum);


	}

}
