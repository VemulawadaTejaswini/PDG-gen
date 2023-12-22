import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input_str[] = new String[2];
			input_str = br.readLine().split("\\s+");
			int V = Integer.parseInt(input_str[0]);
			int E = Integer.parseInt(input_str[1]);

			Node nodes[] = new Node[V];
			for(int i = 0; i < V; i++)nodes[i] = new Node();

			int in_num[] = new int[V];
			for(int i = 0; i < V; i++)in_num[i] = 0;

			int from,to;
			StringBuilder ans = new StringBuilder();

			for(int loop = 0; loop < E; loop++){
				input_str = br.readLine().split("\\s+");
				from = Integer.parseInt(input_str[0]);
				to = Integer.parseInt(input_str[1]);
				in_num[to]++;
				nodes[from].list.add(to);
			}

			Queue<Integer> Q = new ArrayDeque<Integer>();
			for(int i = 0; i < V; i++){
				if(in_num[i] == 0){
					Q.add(i);
				}
			}

			int tmp,tmp2;

			while(!Q.isEmpty()){
				tmp = Q.peek();
				Q.poll();

				ans.append(Integer.toString(tmp)).append("\n");

				for(int i = 0; i < nodes[tmp].list.size(); i++){
					tmp2 = nodes[tmp].list.get(i);
					in_num[tmp2]--;
					if(in_num[tmp2] == 0){
						Q.add(tmp2);
					}
				}
			}
			System.out.print(ans.toString());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class Node{
	public ArrayList<Integer> list;

	Node(){
		list = new ArrayList<Integer>();
	}
}
