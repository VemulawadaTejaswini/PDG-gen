import java.util.ArrayList;
import java.util.Arrays;
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

		int[] except = new int[N];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			friend[a].add(b);
			friend[b].add(a);
			except[a]++;
			except[b]++;

		}
		
		int root[] = new int[N];
		Arrays.fill(root, -1);
		int[] ans = new int[N];
		
		
		for (int sv = 0; sv < N; sv++) { //初期ノードsv
			
			Stack<Integer> stack = new Stack<>(); //空のスタックの用意
			boolean[] visited = new boolean[N];


			//初期ノードを訪問
			visited[sv] = true;
			stack.add(sv);
			if(root[sv]==-1) {
				root[sv] = sv;
			}

			//スタックが空になるまで、スタックから取り出し頂点と接続した頂点を訪問
			//訪問済みの場合は、push関数側が何もせずに終了する
			while(!stack.isEmpty()) {
				int v = stack.pop(); //スタックから頂点取り出す

				/*隣接する頂点をList[]で管理する場合に使う*/
				for(int i : friend[v]) { 

					if (visited[i]) continue; //ノードに訪問済みの時は、ループを飛ばす

					/* 訪問済みにする操作を記述 */
					visited[i] = true;
					ans[sv] ++;
					if(root[i]==-1) {
						root[i] = sv;
					}
					//スタックに、次のスタート地点として追加
					stack.add(i);
				}
			}
		}
		
		List<Integer>[] nofriend = new ArrayList[N];
		for(int i = 0; i < N; i++)
			nofriend[i] = new ArrayList<>();
		for (int i = 0; i < K; i++) {
			int c = sc.nextInt()-1;
			int d = sc.nextInt()-1;
			if(root[c]==root[d]) {
				except[c] ++;
				except[d] ++;
			}
		}

		for(int i = 0; i<N; i++) {
			ans[i] -= except[i];
		}

		for(int i : ans) {
			System.out.print(i + " ");
		}

	}
}

/*
 * DFSのループ内で以下の判定を用いると、containsの計算量が大きくて間に合わない
if(!friend[sv].contains(i) && !nofriend[sv].contains(i)) {
	ans[sv] ++;
}
 */
