import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    int left = 0;
		    int right = list.size() - 1;
		    while (right - left > 1) {
		        int m = (left + right) / 2;
		        if (list.get(m) >= x) {
		            right = m;
		        } else {
		            left = m;
		        }
		    }
		    if (left == 0) {
		        list.add(1, x);
		    } else {
		        list.remove(left);
		        list.add(left, x);
		    }
		}
		System.out.println(list.size() - 2);
   }
}
