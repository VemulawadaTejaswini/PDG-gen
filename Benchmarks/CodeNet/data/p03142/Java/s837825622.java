import java.util.*;
public class Main {
	static Scanner s =new Scanner(System.in);
	public static void main(String[] $){
		int N=s.nextInt(), M=s.nextInt(); //N:頂点数、　M:追加の辺の数
		int[] in=new int[N]; //各頂点の入次数
		int[] ret=new int[N]; // 返却用の配列
		HashMap<Integer, ArrayList<Integer>> lis = new HashMap<Integer,ArrayList<Integer>>(); //各頂点についてその行き先を保持
		for(int i=0;i<N-1+M;i++){
			int from =s.nextInt()-1, to=s.nextInt()-1; //それぞれの頂点番号 1~N を 0~N-1
			in[to]++;
			if (lis.containsKey(from)) lis.get(from).add(to);
			else {
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(to);
				lis.put(from, al);
			}
		}
		// 根は入次数が０のはず。もともと根付き木であるからちょうど1つ存在。
		int root=0;
		for(int i=0;i<N;i++)
			if(in[i]==0) root=i;
		//
		ArrayDeque<Integer> q=new ArrayDeque<>(); //両端キュー
		q.add(root);
		while(!q.isEmpty()){
			int p=q.poll(); //先頭要素を取得し削除
			if (!lis.containsKey(p)) continue;
			for(int o:lis.get(p)){ //pの各々の子らに対し、
				if(--in[o]==0){ // p以外に親がいない、pを親のノードのリストから消す
					ret[o]=p+1; //pの番号を代入
					q.add(o); 
				}
			}
		}
		// for回さずに表示できる
		Arrays.stream(ret).forEach(System.out::println);
	}
}
