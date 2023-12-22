import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int max = 0;
		int i;
		for(i = 0; i<=N;i++) {
			int z = (int)(A*i/B)-A*(int)(i/B);
			if(z >= max) {
				max = z;
			}
		}


		System.out.println(max);
	}

}
