import java.util.*;
public class Main {
	final int MAX = 151200;
	final int N = 100;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [] a = new int[N + 1];
		int [] b = new int[N + 1];
		for(int i = 1; i <= N; i++){
			a[i] = i * i * i;
		}
		for(int i = 1; i <= N; i++){
			b[i] = i * (i+1) * (i+2) / 6;
		}
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int ans = n;
			for(int i = 1; i <= N; i++){
				int result = a[i];
				if(n < result) break;
				ans = Math.min(ans, n - result);
			}
			for(int i = 1; i <= N; i++){
				int result = b[i];
				if(n < result) break;
				ans = Math.min(ans, n - result);
			}
			for(int i = 1; i <= N; i++){
				for(int j = 0; j <= N; j++){
					int result = a[i] + b[j];
					if(n < result) break;
					ans = Math.min(ans, n - result);
				}
			}
			System.out.println(n - ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}