
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int total =0;
		int base = 0;
		int ans = 0;

		for (int i=0; i < N; i++) {
			a[i] = sc.nextInt();
			
			total += a[i];
				
		}
		
		if (total % N ==0) {
			base = total/N;
		}else{
			if(total%2 != 0)
			base = total/N + 1;
			else
				base = total/N;
		}
		
		for (int i=0; i < N; i++) {
			ans += (a[i] - base) * (a[i] - base);
		}

		System.out.println(ans);
		sc.close();
	}

}
