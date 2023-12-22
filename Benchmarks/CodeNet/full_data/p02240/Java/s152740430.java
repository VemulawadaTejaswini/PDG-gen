import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		List<List<Integer>> a = new Vector<List<Integer>>(n);
		for(int i = 0; i < n; ++i) {
			a.add(new LinkedList<Integer>());
		}
		
		int u, v;
		for(int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			u = Integer.parseInt(str[0]);
			v = Integer.parseInt(str[1]);
			
			a.get(u).add(v);
			a.get(v).add(u);
		}

		// classify nodes
		int[] d = new int[n];
		int no = 0;
		ArrayDeque<Integer> st = new ArrayDeque<Integer>(); // stack
		for(int i = 0; i < n; ++i) {
			if(d[i] != 0){
				continue;
			}
			no += 1;
			st.push(i); // first node
			while(st.size() > 0){
				for(Integer node: a.get(st.pop())){
					if(d[node] == 0){
						// push the adjacent nodes
						d[node] = no;
						st.push(node);
						
					}
				}
			}
			
		}
		
		// read Q's
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			u = Integer.parseInt(str[0]);
			v = Integer.parseInt(str[1]);
			if(d[u] != 0 && d[u] == d[v]){
				sb.append("yes\n");
			}else{
				sb.append("no\n");
			}
		}
		System.out.print(sb);
	}

}