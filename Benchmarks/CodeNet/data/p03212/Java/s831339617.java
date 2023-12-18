import java.util.*;
public class Main {
	
	static int len;
	static int num[] = {3,5,7};
	static int cnt;
	static int N;
	static String S;
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		
		S = Integer.toString(N);
		len = S.length();
		cnt = 0;	
		dfs(0);
		System.out.println(cnt);
	}
		
	static void dfs(int x) {
		String res = Integer.toString(x);
		
		boolean is357 = true;
		if(x>N){
				is357 = false;
				return;
		}
		for(int i=0;i<3;i++) {
			int n = num[i];
			if(res.indexOf((char)(n+'0'))==-1) {
				is357 =false;
			}
		}
		if(is357)cnt++;
		
		if(res.length()>=len) return;
		
		for(int i=0;i<3;i++) {
			int n = num[i];
			dfs(x*10+n);
		}
	}
	
}