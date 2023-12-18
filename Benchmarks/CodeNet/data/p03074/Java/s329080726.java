import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int count = 0;
		ArrayList<Unit> list = new ArrayList<>();
		char prev = '1';
		for (int i = 0; i < n; i++) {
			if (prev != arr[i]) {
				list.add(new Unit(prev, count, i));
				count = 1;
			} else {
				count++;
			}
			prev = arr[i];
			if (i == n - 1) {
				list.add(new Unit(prev, count, n));
				if (prev == '0') {
					list.add(new Unit(1, 0, n));
				}
			}
		}
		int max = 0;
		for (int i = 0; i < list.size(); i += 2) {
			Unit start = list.get(i);
			Unit end = list.get(Math.min(i + k * 2, list.size() - 1));
			int amount = end.total - (start.total - start.size);
          
			if (max < amount) {
				max = amount;
			}
		}
		System.out.println(max);
	}
	
	static class Unit {
		int type;
		int size;
		int total;
		
		public Unit(int type, int size, int total) {
			this.type = type;
			this.size = size;
			this.total = total;
		}
		
		public Unit(char c, int size, int total) {
			this(c - '0', size, total);
		}
      
      public String toString() {
        return type + ":" + size + ":" + total;
      }
	}
}
