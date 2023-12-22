import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	static int cnt;
	void dfs(int n,int s,int num){
		if(n == 0){
			if(s == 0)cnt++;
		}else if(s > 0){
			for(int i = num;i <= 9;i++){
				dfs(n-1,s-i,i+1);
			}
		}
	}
	void doIt() {
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n + s == 0)break;
			cnt = 0;
			dfs(n,s,0);
			System.out.println(cnt);
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}