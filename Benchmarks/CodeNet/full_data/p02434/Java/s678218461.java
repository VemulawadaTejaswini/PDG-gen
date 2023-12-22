import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    lists.add(new ArrayList<>());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
		    int type = sc.nextInt();
		    if (type == 0) {
		        lists.get(sc.nextInt()).add(sc.nextInt());
		    } else if (type == 1) {
		        boolean first = true;
		        int idx = sc.nextInt();
		        for (int x : lists.get(idx)) {
		            if (!first) {
		                sb.append(" ");
		            }
		            first = false;
		            sb.append(x);
		        }
		        sb.append("\n");
		    } else {
		        lists.get(sc.nextInt()).clear();
		    }
		}
		System.out.print(sb);
	}
}

