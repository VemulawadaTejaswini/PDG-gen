import java.util.Scanner;

public class Main{
	
	public static Boolean networked(int start, int end, int[][] r, Boolean[] visited) {
		if(start == end) 
			return true;
		for(int i = 0; i < r.length; i++) {
			if(r[i][0] == start && !visited[i]) {
				visited[i] = true;
				return networked(r[i][1], end, r, visited);
			}
		}
		for(int i = 0; i < r.length; i++) {
			if(r[i][1] == start && !visited[i]) {
				visited[i] = true;
				return networked(r[i][0], end, r, visited);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int verts = in.nextInt();
		int relations = in.nextInt();
		int[][] rel_array = new int[relations][2];
		for(int i = 0; i < relations; i++) {
			rel_array[i][0] = in.nextInt();
			rel_array[i][1] = in.nextInt();
		}
		int limit = in.nextInt();
		for(int i = 0; i < limit; i++) {
			Boolean[] visits = new Boolean[relations];
			for(int j = 0; j < relations; j++) {
				visits[j] = false;
			}
			if(networked(in.nextInt(), in.nextInt(), rel_array, visits) == true)
				System.out.println("yes");
			else System.out.println("no");
		}
		in.close();
	}

}

