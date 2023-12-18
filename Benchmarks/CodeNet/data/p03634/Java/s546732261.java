import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main{
	static	ArrayList<HashMap<Integer, Integer>> graph ;
	static long ans = 100000000000L;
	static long first = 100000000000L;
	static long second = 100000000000L;
	static boolean[] used;



	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();

		used = new boolean[n+1];
		graph =new ArrayList<HashMap<Integer,Integer>>();				//arraylistの番号は始点



		for(int i = 0; i <= n;i++){

			HashMap<Integer, Integer> zero = new HashMap<Integer,Integer>();
			zero.put(0, 0);

			graph.add(i, zero);					//getで始点を指定、putで<隣接点、距離>を入れていく
		}

		for(int i = 0;i < n-1;i++){
			int a = sc.nextInt();			
			int b = sc.nextInt();
			int c = sc.nextInt();

			//getで始点を指定、putで<隣接点、距離>を入れていく

			graph.get(a).put(b, c);					//getで始点を指定、putで<隣接点、距離>を入れていく
			graph.get(b).put(a, c);					//getで始点を指定、putで<隣接点、距離>を入れていく


		}







		int q = sc.nextInt();				//問題数
		int k = sc.nextInt();				//通らなきゃいけない場所

		for(int i = 0;i <q;i++){
			ans = 100000000000L;


			int x = sc.nextInt();			//始点
			int y = sc.nextInt();			//終点
			used[x] = true;
			used[0] = true;
			dfs(x,k,0);
			first = ans;

			Arrays.fill(used, false);    	 	//リセット

			ans = 100000000000L;
			used[k] = true;
			used[0] = true;

			dfs(k,y,0);
			first +=  ans;

			Arrays.fill(used, false);    	 	//リセット
			System.out.println(first);
		}



	}

	static void dfs(int p,int g,long sum){



		if(p == g){
			ans = Math.min(ans, sum);

			return ;
		}

		for(int i:graph.get(p).keySet()){
			if(!(used[i])){
				used[i] = true;
				dfs(i, g , sum + graph.get(p).get(i));
			}
		}

		return ;


	}


}


