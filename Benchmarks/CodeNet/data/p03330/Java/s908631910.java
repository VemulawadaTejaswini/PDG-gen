import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[c + 1][c + 1];
		for (int i = 1; i <= c; i++) {
		    for (int j = 1; j <= c; j++) {
		        matrix[i][j] = sc.nextInt();
		    }
		}
		ArrayList<HashMap<Integer, Integer>> list = new ArrayList<>();
		ArrayList<HashMap<Integer, Integer>> results = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
		    list.add(new HashMap<>());
		    results.add(new HashMap<>());
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        int type = (i + j) % 3;
		        int color = sc.nextInt();
		        if (list.get(type).containsKey(color)) {
		            list.get(type).put(color, list.get(type).get(color) + 1);
		        } else {
		            list.get(type).put(color, 1);
		        }
		    }
		}
		for (int i = 0; i < 3; i++) {
		    for (Map.Entry<Integer, Integer> entry1 : list.get(i).entrySet()) {
		        int cost = 0;
		        for (Map.Entry<Integer, Integer> entry2 : list.get(i).entrySet()) {
		            cost += matrix[entry2.getKey()][entry1.getKey()] * entry2.getValue();
		        }
		        results.get(i).put(entry1.getKey(), cost);
		    }
		}
		int min = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry1 : results.get(0).entrySet()) {
		    for (Map.Entry<Integer, Integer> entry2 : results.get(1).entrySet()) {
		        if (entry1.getKey() == entry2.getKey()) {
		            continue;
		        }
		        for (Map.Entry<Integer, Integer> entry3 : results.get(2).entrySet()) {
		            if (entry1.getKey() == entry3.getKey() || entry2.getKey() == entry3.getKey()) {
		                continue;
		            }
		            min = Math.min(min, entry1.getValue() + entry2.getValue() + entry3.getValue());
		        }
		    }
		}
		System.out.println(min);
    }
}

