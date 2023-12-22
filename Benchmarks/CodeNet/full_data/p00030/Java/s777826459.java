import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean[] check = new boolean[10];
	static int n;
	static int s;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			Arrays.fill(check,false);
			n = sc.nextInt();
			s = sc.nextInt();
			if(n==0 && s==0)break;
			int ans = dfs(0,0,-1);
			System.out.println(ans);
		}
	}
	
	static int dfs(int pos, int sum, int max){
		if(sum == s && pos==n)return 1;
		if(sum > s)return 0;
		if(pos > n)return 0;
		
		int ret = 0;
		for(int i=max+1; i<10; i++){
			if(!check[i]){
				check[i]=true;
				ret += dfs(pos+1,sum+i,i);
				check[i]=false;
			}
		}
		return ret;
	}
}