import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    String key = sc.next();
		    if (type == 0) {
		        int value = sc.nextInt();
		        map.put(key, value);
		    } else {
		        sb.append(map.get(key)).append("\n");
		    }
		}
		System.out.print(sb);
	}
}

