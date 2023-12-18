import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int a = 1;a <= N;++a) {
			int b = K-a;
			while(b <= 0)
				b += K;
			if((b + b) % K != 0)continue;
			if(b > N)continue;
			
			ans += ((N - b)/K + 1) * ((N - b)/K + 1);
		}
		System.out.println(ans);
	}
}
