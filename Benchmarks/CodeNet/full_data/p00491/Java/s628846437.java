import java.util.*;
public class Main {
	static int cnt=0;
	static int n;
	static int bfs(int a,int b,int day){
		int cnt=0;
		if(day==n+1){//もしたどり着けたら1を返す。
			return 1;
		}
		if(m[day][a][b]>-1)return m[day][a][b];//メモしていたらそれを返す。
		if(hyou[day]>0){//指定してある場合
			if(hyou[day]==a&&a==b){//全部一緒だったら0を返す。
				return 0;
			}else{
				return bfs(b,hyou[day],day+1)%10000;//違ったら日にち足して次の日に再帰。
			}
		}
		for(int i=1;i<=3;i++){
			if(a==i&&b==a)continue;
			cnt+=bfs(b,i,day+1)%10000;
		}
		m[day][a][b]=cnt%10000;
		return cnt%10000;
	}
	static int m[][][]=new int[101][4][4];
	static int hyou[]=new int[101];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int k = in.nextInt();
		for(int s=0;s<101;s++){
			hyou[s]=0;
			for(int i=0;i<4;i++){
				for(int z=0;z<4;z++)m[s][i][z]=-1;
			}
		}
		for(int i=0;i<k;i++){
			int w = in.nextInt();
			hyou[w]=in.nextInt();
		}
		int ans = bfs(0,0,1);
		System.out.println(ans);
	}
}