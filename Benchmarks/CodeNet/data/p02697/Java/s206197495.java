import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[M];
		int[] b = new int[M];

		int i = 0;

		if(N%4 != 2) {
		for(i = 0; i < M; i++) {
			a[i]=N-i;
			b[i]= i+1;
			System.out.println(a[i] + " " + b[i]);
		}
		}else {
			for(i = 0; i < M; i++) {
				a[i]=N;
				b[i]= i+1;
				System.out.println(a[i] + " " + b[i]);
			}
		}

	}

}