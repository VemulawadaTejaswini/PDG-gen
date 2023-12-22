import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0092().doIt();

	}

	class AOJ0092{
		boolean[][] map;
		int n;

		boolean check(int x,int y,int a){
			for(int i=x;i<=x+a;i++)for(int s=y;s<=y+a;s++){
				if(i>=n||s>=n)return false;
				if(map[s][i]==false)return false;
			}
			return true;
		}

		void solve(){
			int max = 0;
			for(int i=0;i<n;i++){
				if(n-max<i)break;
				for(int s=0;s<n;s++)if(map[i][s]){
					if(n-max<s)break;
					for(int k = max;k<=n;k++){
						if(check(s,i,max))max++;
						else break;
					}
				}
			}
			System.out.println(max);
		}

		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				map = new boolean[n][n];
				for(int i=0;i<n;i++){
					char[] a = in.next().toCharArray();
					for(int s=0;s<n;s++)map[i][s] = a[s]=='.';
				}
				solve();
			}
		}
	}

}