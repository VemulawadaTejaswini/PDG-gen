import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ptr = 0;
		int[] prime = new int[10001];
		boolean[] check = new boolean[10001];
		check[0] = false;
		check[1] = false;
		check[2] = true;
		check[3] = true;
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		for(int i = 5; i <= 10000; i += 2){
			boolean wflag = false;
			for(int j = 1; prime[j] * prime[j] <= i; j++){
				if(i % prime[j] == 0){
					wflag = true;
					break;
				}
			}
			if(!wflag){
				prime[ptr++] = i;
				check[i] = true;
			}
		}
		while(sc.hasNext()){
			int n = sc.nextInt();
			int ans = 0;
			for(int i = 1; i <= n; i++){
				if(check[i] && check[n - i + 1])
					ans++;
			}
			System.out.println(ans);
		}
	}
}