import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String A[] = new String[N];
		for(int i=0;i<M;i++)A[i]=sc.next();
		sc.close();
		
		String dp[] = new String[N+1]; //i本使って、できる最大の数をStringで格納
		Arrays.fill(dp, "");
		dp[0]="";
		for(int i=0;i<=N;i++) {
			for(int j=0;j<M;j++) {
				if(i-f(A[j])<0)continue;
				if(i-f(A[j])!=0&dp[i-f(A[j])]=="")continue;
				dp[i]= max(dp[i],dp[i-f(A[j])]+A[j]);
			}
		}
		System.out.println(dp[N]);		
	}	
	
	//文字Aを作るのに必要なマッチの数を返す。
	static int f(String A) {
		int a = Integer.parseInt(A);
		a--;
		int v[] = {2,5,5,4,5,6,3,7,6}; //1~9
		return v[a];
	}
	
	//文字列a,bの大きい方を返す。
	static String max(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		if(alen>blen) return a;
		else if(alen<blen) return b;
		else {
			if(a.compareTo(b)>=0) return a;
			else return b;
		}
	}
}
