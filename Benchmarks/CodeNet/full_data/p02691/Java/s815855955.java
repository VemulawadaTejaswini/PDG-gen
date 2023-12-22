
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Long[] a = new Long[N];
		Long[] L = new Long[N];
		Long[] R = new Long[N];

		int i = 0;

		while(i < N) {
			a[i] = sc.nextLong();
			L[i] = i + a[i];
			R[i] = i - a[i];
			i++;

		}

		int counter=0;
		int j;

		for( i = 0; i < N-1; i++) {
			for(j = i+1; j<N; j++) {
				if(L[i] == R[j]) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}

