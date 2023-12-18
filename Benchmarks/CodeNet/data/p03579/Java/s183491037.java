import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			int A = in.nextInt() -1;
			int B = in.nextInt() -1;
			list.get(A).add(B);
			list.get(B).add(A);
		}
		
		//二部グラフ判定
		boolean bip = true;
		
		int[] color = new int[N];
		LinkedList<Integer> stack = new LinkedList<>();
		color[0] = 1;
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int node = stack.pop();
			int size = list.get(node).size();
			for (int i = 0; i < size; i++) {
				int next = list.get(node).get(i);
				if(color[next] == 0){
					color[next] = (-1)*color[node];
					stack.push(next);
				}else{
					if(color[next] == color[node]){
						bip = false;
					}
				}
			}
		}
		
		if(bip){
			int plus = 0;
			int minus = 0;
			for (int i = 0; i < N; i++) {
				if(color[i] == 1) plus ++;
				else minus ++;
			}
			System.out.println(1L*plus*minus-M);
		}else{
			System.out.println(1L*N*(N-1)/2-M);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}