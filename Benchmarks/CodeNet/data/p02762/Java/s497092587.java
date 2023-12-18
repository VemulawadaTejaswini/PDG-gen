import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//深さ優先探査（DFS）
//Depth-first search
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //頂点

		/*a[] b[]でどの頂点どうしが結ばれているか入力された場合、List[]で管理する*/
		//頂点を結ぶ道をリストで管理
		int M = sc.nextInt(); //入力される道の数
		int K = sc.nextInt(); 
		List<Integer>[] friend = new ArrayList[N];
		for(int i = 0; i < N; i++)
			friend[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			friend[a].add(b);
			friend[b].add(a);
		}
		
		List<Integer>[] nofriend = new ArrayList[N];
		for(int i = 0; i < N; i++)
			nofriend[i] = new ArrayList<>();
		for (int i = 0; i < K; i++) {
			int c = sc.nextInt()-1;
			int d = sc.nextInt()-1;
			nofriend[c].add(d);
			nofriend[d].add(c);
		}
		int[] ans = new int[N];
		int count = 0;
		for (int sv = 0; sv < N; sv++) { //初期ノードsv
			//System.out.println("-----------------------");
			//System.out.println("sv = " + sv);

			Stack<Integer> stack = new Stack<>(); //空のスタックの用意
			boolean[] visited = new boolean[N];

			//初期ノードを訪問
			visited[sv] = true;
			stack.add(sv);

			//スタックが空になるまで、スタックから取り出し頂点と接続した頂点を訪問
			//訪問済みの場合は、push関数側が何もせずに終了する
			while(!stack.isEmpty()) {
				int v = stack.pop(); //スタックから頂点取り出す
				//System.out.println("root = " + v);

				/*隣接する頂点をList[]で管理する場合に使う*/
				for(int i : friend[v]) { 
					
					
					if (visited[i]) continue; //ノードに訪問済みの時は、ループを飛ばす
					//System.out.println("i = " + i);
					
					/* 訪問済みにする操作を記述 */
					visited[i] = true;
					if(!friend[sv].contains(i) && !nofriend[sv].contains(i)) {
						//System.out.println("ans++");
						ans[sv] ++;
					}
			
					//スタックに、次のスタート地点として追加
					stack.add(i);


				}
			}
			//System.out.println("-----------------------");
		}
		
//		System.out.println();
//		
//		for (int i = 0; i < M; i++)
//		System.out.println(friend[i]);
//		
//		System.out.println();
//		for (int i = 0; i < K; i++)
//			System.out.println(nofriend[i]);

		for(int i : ans) {
			System.out.print(i + " ");
		}

	}
}
