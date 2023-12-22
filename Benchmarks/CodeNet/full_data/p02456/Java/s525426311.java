import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    int x = sc.nextInt();
		    if (type == 0) {
		        set.add(x);
		        sb.append(set.size()).append("\n");
		    } else if (type == 1) {
		        if (set.contains(x)) {
		            sb.append(1);
		        } else {
		            sb.append(0);
		        }
		        sb.append("\n");
		    } else {
		        set.remove(x);
		    }
		}
		System.out.print(sb);
	}
}

