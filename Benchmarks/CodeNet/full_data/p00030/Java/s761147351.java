import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0030().doIt();
	}
	
	class AOJ0030{
		int n,m;
		int cnt;
		void  dfs(int num,int sum,int k){
			if(sum==m&&k==n){
				cnt++;return;
			}else if(k==n)return;
			for(int i=num+1;i<10;i++){
				dfs(i,sum+i,k+1);
			}
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();m = in.nextInt();
				if(n+m==0)break;
				cnt = 0;
				dfs(-1, 0, 0);
				System.out.println(cnt);
			}
		}
	}
	
}