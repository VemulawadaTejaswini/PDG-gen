import java.util.*;

// Do not use int, use long!!

public class Main {
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();  // n <= 2e5 so cannot N^2
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int counter = 0;
			for (int i = 0; i < n; i++) {
				numbers.add(sc.nextInt());
			}
			
			Collections.sort(numbers);

			while (numbers.size() >= 2) {
				int tmp = 0;
				for (int i = numbers.size()-2; i >= 0 ; i--) {
					if (nibeki(numbers.get(numbers.size()-1),numbers.get(i))) {
						numbers.remove(i);
						numbers.remove(numbers.size()-1);
						counter++;
						tmp++;
						break;
					}
				}
				if (tmp == 0) {
					numbers.remove(numbers.size()-1);
				}
				tmp = 0;
			}
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
