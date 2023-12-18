//2019.11.09  参考元:new18さんのコード
//https://atcoder.jp/contests/nikkei2019-qual/submissions/6771098

import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //N頂点
		int n=sc.nextInt();
        //m本の有向辺を追加
		int m=sc.nextInt();
        //有向辺をいくつ受けているかをカウントする配列
		int[] dg=new int[n];
		ArrayList<Integer>[] list=new ArrayList[n];
		for(int i=0; i<n; i++){
        	//リストの中にリストを作成（2次元）
            //なお、データ型は省略し<>となっている
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<n+m-1; i++){
			int a =sc.nextInt()-1;
			int b =sc.nextInt()-1;
            
			dg[b]++;
            //最終的には
            //dg[0] = 0
            //dg[1] = 1
            //dg[2] = 2 となっている
			list[a].add(b);
            //list[a]は頂点番号aからどこへ向かってるかを格納する配列
            //今回は、
            //list[0] = 1, 2
            //list[1] = 2
            //list[2] = NULL
		}
		int root=0;
		for(int i=0; i<n; i++){
			if(dg[i]==0){
				root=i;
				break;
			}
		}
        
		int[] ans=new int[n];
      	//ちょっとした注意点：
        //newで宣言した時点で、配列の各要素は全て0が格納されている。
        //よって現段階では ans[0] = ans[1] = ans[2] = 0
        
        //双方向結合リストの作成
		LinkedList<Integer> que=new LinkedList<>();
        //リストの一番最初に根を持ってくる
		que.add(root);
      	//この時点でque = [0]
        
        //全ての頂点を調べ上げるまで無限ループ
		while(!que.isEmpty()){
        
        //.poll()はキューの先頭を取得し、削除するメソッド
			int g=que.poll();
            
            //最初にgに入るのは根となる頂点
            //今回はg=0(頂点1)からスタート
            
            //[[拡張for文]]　for (データ型 変数名: コレクション)
            //iにlist[g]の値を代入する
			for(int i:list[g]){
              // 1週目：g = 0
              // i はlist[0]から1を獲得。dg[1]は1 → 0
              // dg[1] = 0となるため、if文に入りans[1] = 0+1 = 1
              // queにiが追加され、que = [1]
              // 2週目：
              // i はlist[0]から2を取得。dg[2]は2 → 1
              // dg[2] = 1 なので、if文には入らない。
              //
              // ここで、list[0]の要素であるi=1,2のチェックが終了したため、for文から出る
              
              //queは空ではないため、再びwhile文を回す。
              //que.pollより、 g = 1
              //1週目：g = 1
              //iはlist[1]から2を取得。dg[2]は1 → 0
              //dg[2] = 0となるため、if文に入りans[2] = 1+1 = 2
              //queにiが追加され、que = [2]
              //
              //ここで、list[1]の要素であるi=2のチェックが終了したため、for文から出る
              
              //queは空ではないため、再びwhile文を回す。
              //que.pollより、 g = 2
              //list[2]はNULLのため、for文内の処理は無視されてforループを出る
              //queが空なので、while文も出る
				dg[i]--;
				if(dg[i]==0){
					ans[i]=g+1;
					que.add(i);
				}
                
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}
