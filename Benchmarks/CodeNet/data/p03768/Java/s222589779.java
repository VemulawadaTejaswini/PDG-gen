import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();
	static int M = scan.nextInt();
	static int dp[]=new int[N];//メモ化
	static int count;







	public static void paint(int v,int c,V vs[]){
//		if(count<0){return;}//探索が奥まで行ったら終了
		if(dp[v]>=count&count!=0){return;}//来たことがあってより深くまで塗れないなら帰る
		if(vs[v].color==0){
			vs[v].color=c;
		}
		dp[v]=count;
		if(count>0){
			count--;
			for(int j=0;j<vs[v].size();j++){
				paint(vs[v].get(j),c,vs);
		}
			count++;
		}



	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		V vs[] = new V[N];
		for(int i =0;i<N;i++){
			vs[i] = new V(i);
		}


		int a;
		int b;

		for(int i =0;i<M;i++){
			a=scan.nextInt()-1;
			b=scan.nextInt()-1;

			vs[a].add(b);
			vs[b].add(a);

//			dp[a[i]][b[i]]=1;
//			dp[b[i]][a[i]]=1;
			//a_i,b_iは0 ~ N-1
			//二つがつながっていたらdp=1
		}

		int Q = scan.nextInt();
		int v[] = new int[Q];
		int d[] = new int[Q];
		int c[] = new int[Q];

		for(int i =0;i<Q;i++){
			v[i]=scan.nextInt() - 1;
			d[i]=scan.nextInt();
			c[i]=scan.nextInt();
		}

		//ここから塗りつぶし動作
		for(int i =Q-1;i>=0;i--){
			count = d[i];
					paint(v[i],c[i],vs);

			}

		for(int i=0;i<N;i++){
			System.out.println(vs[i].color);
		}

		}

	static class V extends ArrayList<Integer>{
		int id;
		int color = 0;
		V(int _id){
			id = _id;
		}
	}



	}
