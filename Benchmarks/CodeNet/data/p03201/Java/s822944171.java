import java.util.*;

// Do not use int, use long!!

public class Main {
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			int n = Integer.parseInt(sc.next());  // n <= 2e5 so cannot N^2
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int counter = 0;
			for (int i = 0; i < n; i++) {
				numbers.add(Integer.parseInt(sc.next()));
			}
			
			Collections.sort(numbers); // O(n log n) << 1e6

			while (numbers.size() > 2) {
				int tmp = 0;
				for (int i = numbers.size()-1; i >= 1 ; i--) {
					if (nibeki(numbers.get(0),numbers.get(i))) {
						counter++;
						tmp++;
						break;
					}
				}
				numbers.remove(0);
				if (tmp != 0) {
					numbers.remove(numbers.size()-1);
				}
				tmp = 0;
			}
			// maybe O(n)? but worst case is n + n-1 + ...1 = n*n-1/2
			// so it'll b TLE

			System.out.println(counter);
			sc.close();
		}
	
		public static boolean nibeki(int a, int b) {
			int c = a+b;
			while (c%2 == 0) {
				c = c/2;
			}
			if (c == 1) {
				return true;
			} else {
				return false;
			}
		}

}