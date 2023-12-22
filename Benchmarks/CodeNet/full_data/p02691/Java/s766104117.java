
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];

		int i = 0;

		while(i < N) {
			a[i] = sc.nextInt();
			i++;
		}

		int counter=0;
		int j;

		for( i = 0; i < N-1; i++) {
			for(j = i+1; j<N; j++) {
				if(a[i] + a[j] <= N-1) {
					if(Math.sqrt(j-i) == Math.sqrt(a[i]+a[j])) {
						counter++;
					}
				}
			}
		}
		System.out.println(counter);
	}

}

