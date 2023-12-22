import java.util.Scanner;

public class Main {
	static int solve(int K){
		int init = 7 % K;
		if(init == 0){
			return 1;
		}
		int vis[] = new int[K + 1];
		vis[init] = 1;
		for(int i = 2 ; ; ++i){
			init = init * 10 + 7;
			init = init % K;
			if(init == 0){
				return i;
			}
			if(vis[init] == 1){
				return -1;
			}
			vis[init] = 1;
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		System.out.println(solve(K));
	}
}
