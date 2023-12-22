import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String input = br.readLine();

			if(input == null){
				break;
			}

			String[] tmpArray = input.split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int q = Integer.parseInt(tmpArray[1]);

			if(n == 0 && q == 0){
				break;
			}

			Node[] nodes = new Node[n + 1];
//			nodes[0] = new Node(0, -1);
//			nodes[0].marked = true;

			nodes[1] = new Node(1, 0);
			nodes[1].marked = true;

			for(int i = 2; i <= n; i++){
				int num = Integer.parseInt(br.readLine());

				nodes[i] = new Node(i, num);
			}

			long sum = 0;

			for(int i = 0; i < q; i++){
				tmpArray = br.readLine().split(" ");
				int tmp = Integer.parseInt(tmpArray[1]);
				if(tmpArray[0].equals("M")){
					nodes[tmp].marked = true;
				}

				else {
					sum += nearest(nodes, tmp);
				}
			}

			System.out.println(sum);
		}
	}

	static int nearest(Node[] nodes, int id){
		while(true){

//			System.out.println("id = "+id);

			if(nodes[id].marked){
				return id;
			}

			id = nodes[id].parent;
		}
	}

}

class Node {
	int id;
	int parent;
	boolean marked = false;

	public Node(int id, int parent){
		this.id = id;
		this.parent = parent;
	}
}
