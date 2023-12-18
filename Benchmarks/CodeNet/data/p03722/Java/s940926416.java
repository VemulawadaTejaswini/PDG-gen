import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{


	static int[][] map ;
	static long INF =Long.MAX_VALUE/2;
	static int n,m ;
	static	long[] dis;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		n = sc.nextInt();
		m = sc.nextInt();
		Edge[] v = new Edge[m];

		for(int i = 0;i < m;i++){
			v[i]=new Edge();
			v[i].from=sc.nextInt();
			v[i].to=sc.nextInt();
			v[i].cost=-sc.nextInt();		//ベルマンフォードを使うためにわざとマイナスにしている
		}

		dis = new long[n+1];
		Arrays.fill(dis, INF);
		dis[1] = 0;

		boolean flag = true;
		long ans = 0;
		int count = 0;

		while(flag){
			flag = false;
			for(int i = 0;i < m;i++){
				if(dis[v[i].from] + v[i].cost < dis[v[i].to]){
					dis[v[i].to]=dis[v[i].from]+v[i].cost;
					flag= true;
				}
			}

			if(count == n){
				ans = dis[n];
			}

			if(count == 2*n){						//閉路に入った時
				if(ans > dis[n]){					//閉路がプラスループ
					System.out.println("inf");
					return;
				}else{								//閉路がマイナスループ
					System.out.println(-dis[n]);
					return;
				}
			}

			count++;
			if(!flag){					//更新なしだったらループ出る
				break;
			}


		}
		System.out.println(-dis[n]);


	}



}
class Edge{
	int to;
	int from;
	int cost;
}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


