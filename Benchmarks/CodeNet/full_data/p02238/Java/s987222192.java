import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] discovers;
    static int[] finishes;
    static int time = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		discovers = new int[n];
		finishes = new int[n];
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n; i++) {
		    int from = sc.nextInt() - 1;
		    int count = sc.nextInt();
		    for (int j = 0; j < count; j++) {
		        graph.get(from).add(sc.nextInt() - 1);
		    }
		}
		for (int i = 0; i < n; i++) {
		    if (discovers[i] == 0) {
		        search(i);
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    sb.append(i + 1).append(" ").append(discovers[i]).append(" ").append(finishes[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	static void search(int x) {
	    time++;
	    discovers[x] = time;
	    for (int y : graph.get(x)) {
	        if (discovers[y] == 0) {
	            search(y);
	        }
	    }
	    time++;
	    finishes[x] = time;
	}
}

