import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		int sum = 0;
		int[] s = new int[n];

		s[0] = sc.nextInt();

		for(int i=1;i<n;i++){
			s[i] = s[i-1]+sc.nextInt();
		}

		int ans = 999;

		for(int x=0;x<n-1;x++){
			ans = Math.min(ans,s[x]>(s[n-1]-s[x])?s[x]-(s[n-1]-s[x]):s[n-1]-s[x]-s[x]);
		}

		// 出力
		System.out.println(ans);
	}
}