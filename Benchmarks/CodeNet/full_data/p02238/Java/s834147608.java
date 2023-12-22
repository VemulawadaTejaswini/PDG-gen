import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String args[]) throws IOException{
		new Main().mainrun();
	}

	private BufferedReader br ;
	private int N,time;
	private Node[] L;
	private Integer[] D,F;
	private boolean[] flag;

	private void mainrun() throws NumberFormatException, IOException{
		br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		L = new Node[N];

		D = new Integer[N];
		F = new Integer[N];

		flag = new boolean[N];
		Arrays.fill(flag, true);
		time = 0;

		for(Integer i = 0;i < N;i++) {
			L[i] = new Node(i);
		}

		for(int i = 0;i < N;i++) {
			String[] str = br.readLine().split(" ");
			int id = Integer.parseInt(str[0]) - 1;
			L[id].id = id;

			L[id].setArray(Integer.parseInt(str[1]));

			for(int j = 0;j < Integer.parseInt(str[1]);j++) {
				int child = Integer.parseInt(str[j + 2]);

				L[id].child[j] = child - 1;
			}
		}

		for(int i = 0;i < N;i++) {
			if(flag[i]) {
				putTime(i);
			}
		}

		for(int i = 0;i < N;i++) {
			System.out.printf("%d %d %d\n", i+1,D[i],F[i]);
		}

		br.close();
	}

	private void putTime(int id) {
		time++;

		flag[id] = false;
		D[id] = time;
		
		for(Integer i : L[id].child) {
			if(flag[i]) {
				flag[i] = false;
				putTime(i);
			}
		}
		time++;
		F[id] = time;
	}
}

class Node{
	public int id;
	public Integer[] child;

	public Node(int id)
	{
		this.id = id;
	}

	public void setArray(int n) {
		child = new Integer[n];
	}
}

