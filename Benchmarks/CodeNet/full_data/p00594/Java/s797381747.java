import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n == 0) return;
			
			intArray.clear();
			
			for(int i = 0; i < n; i++) {
				int v = scanner.nextInt();
				intArray.add(Integer.valueOf(v));
			}
			
			int size = intArray.size();
			int count = 0;
			
			for(int i = 0; i < size / 2; i++) {
				int t = (int)intArray.get(i);
				count = 1;
				for(int k = i + 1; k < size; k++) {
					if (t == (int)intArray.get(k)) {
						count++;
					}
				}
				if (count > size / 2) {
					System.out.println(t);
					break;
				}
			}
			if (count <= size / 2) {
				System.out.println("NO COLOR");
			}
		}
	}
}