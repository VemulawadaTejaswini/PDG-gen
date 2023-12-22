import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0030().doIt();
	}
	class AOJ0030{
		int n,s;
		int dfs(int index,int sum,int cost){
			int result = 0;
			if(cost==n){
				if(sum==s)return 1;
				else return 0;
			}
			if(index>9)return 0;
			if(sum>s)return 0;
			result+=dfs(index+1,sum+index,cost+1);//indexをとる場合。
			result+=dfs(index+1, sum, cost);//indexを取らない場合。
			return result;
		}
		
		void doIt() {
			while(true){
				n = in.nextInt();
				s = in.nextInt();
				if(n+s==0)break;
				System.out.println(dfs(0,0,0));
			}
		}
	}
}