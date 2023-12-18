import java.util.ArrayList;
import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static long[][] dp;
	static int ans = 100000000;
	static	boolean[] flag ;

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);			//文字の入力
		N = s.nextInt();
		M = s.nextInt();
		ArrayList<Bridge> graph = new ArrayList<Bridge>();
		boolean[] num = new boolean[50];

		for(int i = 1;i < N+1;i++){
			Bridge bridge = new Bridge(i);
			graph.add(bridge);
		}


		for(int i = 0;i < M;i++){				//グラフ作成
			int a = s.nextInt();
			int b = s.nextInt();


			//すでにその町を作ってある時
			for(int j = 0;j < graph.size();j++){

				if(graph.get(j).p == a){				//町を探す
					graph.get(j).addtown(b);				//町に隣接する町を加える
				}
			}
			for(int j = 0;j < graph.size();j++){
				if(graph.get(j).p == b){				//さっきと逆方向にも繋げる
					graph.get(j).addtown(a);				
				}

			}
		}


		int ans = 0;


		for(int i = 0;i < graph.size();i++){

			if(graph.get(i).townnum() == 1){				//隣接する町が一つなら、その町は橋になるのでグラフから消去
				ans++;
				int deletetown = graph.get(i).p;				//削除する町
				graph.remove(i);

				i = -1;									//削除した後に、隣接する町が一つになる町も出てくる可能性があるのでiをリセットする。
				for(int j = 0;j < graph.size();j++){			//全ての町について、削除する町とつながってる町を探す
					ArrayList<Integer> judge = graph.get(j).town;

					for(int k = 0;k < judge.size();k++){				//つながっている辺を削除
						if(judge.get(k) == deletetown){

							judge.remove(k);
							break;
						}
					}
				}
			}
		}

		System.out.println(ans);





	}

}
class Bridge{
	int p;			//自分の場所
	ArrayList<Integer> town = new ArrayList<Integer>();				//辺でつながっている町
	public Bridge(int n) {
		p = n;
	}
	void addtown(int t){
		town.add(t);
	}

	int townnum(){
		return town.size();
	}





}


