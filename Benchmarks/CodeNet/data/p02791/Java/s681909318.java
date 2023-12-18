import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N+1];
		for(int i = 1;i <= N;i++){
			P[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		for(int i = 1;i <= N;i++){
			int cnt = 0;
			for(int j = 1;j <= i;j++){
				if(P[i] <= P[j]){
					cnt++;
				}else{
					break;
				}
			}
			if(cnt == i){
				ans++;
			}
		}
		System.out.println(ans);
	}
}