import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<TreeSet<Integer>> list = new ArrayList<>();
		list.add(new TreeSet<>());
		int max = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    boolean added = false;
		    for (int j = list.size() - 1; j >= 0; j--) {
		        Integer y = list.get(j).ceiling(x);
		        if (y != null && y - k <= x) {
		            if (j == list.size() - 1) {
		                list.add(new TreeSet<>());
		            }
		            list.get(j + 1).add(x);
		            added = true;
		            break;
		        }
		        y = list.get(j).floor(x);
		        if (y != null && y + k >= x) {
		            if (j == list.size() - 1) {
		                list.add(new TreeSet<>());
		            }
		            list.get(j + 1).add(x);
		            added = true;
		            break;
		        }
		    }
		    if (!added) {
		        list.get(0).add(x);
		    }
		}
		System.out.println(list.size());
	}
}
