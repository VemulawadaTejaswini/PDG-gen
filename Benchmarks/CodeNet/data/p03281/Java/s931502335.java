import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int ans = 0;

		if((N%2 == 0) || (N<105)) {
			System.out.println(0);
			return;
		}

		for(int j = 105; j<=N; j=+2){
			for(int i = 1; i<=j; i++){
				if(j%i == 0){
					cnt++;
				}
			}
			if(cnt == 8) ans++;
		}

		System.out.println(ans);
	}
}