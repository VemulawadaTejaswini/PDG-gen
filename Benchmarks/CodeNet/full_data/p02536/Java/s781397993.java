import java.util.Scanner;

public class Main {
	
	public static void unionParent(int[] parent, int node1, int node2) {
		int p1 = getParent(parent, node1);
		int p2 = getParent(parent, node2);

		if (p1 > p2)
			parent[p1] = p2;
		else
			parent[p2] = p1;
	}

	public static int getParent(int[] parent, int e) {
		if (parent[e] == e)
			return e;
		return getParent(parent, parent[e]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] line = sc.nextLine().split(" ");
		int n = Integer.valueOf(line[0]);
		int m = Integer.valueOf(line[1]);
		
		int[] parent = new int[n+1];
		for (int i = 1; i <= n ; i++)
			parent[i] = i;
		
		for (int i = 0 ; i < m ; i++) {	
			line = sc.nextLine().split(" ");
			int a = Integer.valueOf(line[0]);
			int b = Integer.valueOf(line[1]);
			unionParent(parent, a, b);
		}
		
		int count = 0;
		for (int i = 1 ; i <= n - 1 ; i++)
			if (parent[i] != parent[i+1])
				count++;
		System.out.println(count);
		
		sc.close();
	}
}