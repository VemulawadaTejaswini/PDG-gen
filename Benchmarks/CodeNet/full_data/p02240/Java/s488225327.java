import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		short n = Short.parseShort(str[0]);
		short m = Short.parseShort(str[1]);
		
		List<List<Short>> a = new LinkedList<List<Short>>();
		for(int i = 0; i < n; ++i) {
			a.add(new LinkedList<Short>());
		}
		
		short u, v;
		for(int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			u = Short.parseShort(str[0]);
			v = Short.parseShort(str[1]);
			
			a.get(u).add(v);
			a.get(v).add(u);
		}
		//return;
		
		Short q = Short.parseShort(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Short> st = new ArrayDeque<Short>();
		
		question: for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			boolean[] d = new boolean[n]; 
			st.clear();
			st.push(Short.parseShort(str[0])); // first node
			Short frid = Short.parseShort(str[1]); // friend id

			while(st.size() > 0){
				Short pn = st.pop(); // present node
				
				for(Short node: a.get(pn)){
					if(d[node] == false){
						if(node == frid){
							sb.append("yes\n");
							continue question;
						}
						// push the adjacent nodes
						d[pn] = true;
						st.push(node);
					}
				}
			}
			sb.append("no\n");
		}
		
		System.out.print(sb);
	}

}