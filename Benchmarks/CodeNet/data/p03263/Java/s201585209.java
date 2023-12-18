import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] field = new int[h + 1][w + 1];
		for (int i = 1; i <= h; i++) {
		    for (int j = 1; j <= w; j++) {
		        field[i][j] = sc.nextInt();
		    }
		}
		ArrayList<Graph> list = new ArrayList<>();
		for (int i = 1; i <= h; i++) {
	        for (int j = 1; j < w; j++) {
	            if (field[i][j] % 2 == 1) {
	                field[i][j + 1]++;
	                list.add(new Graph(i, j, i, j + 1));
	            }
	        }
	        if (field[i][w] % 2 == 1 && i < h) {
	            field[i + 1][w]++;
	            list.add(new Graph(i, w, i + 1, w));
	        }
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for (Graph g : list) {
		    sb.append(g);
		}
		System.out.print(sb);
    }
    
    static class Graph {
        int a;
        int b;
        int c;
        int d;
        
        public Graph(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public String toString() {
            return new StringBuilder().append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n").toString();
        }
    }
}

