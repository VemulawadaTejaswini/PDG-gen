import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n - 1; i++) {
			list.add(scanner.nextInt());
		}
		
		for(int i = 1; i < n + 1; i++) {
			int count = 0;
			for(int value : list){
				if(value == i)
					count++;
			}
			System.out.println(count);
		}

		scanner.close();
	}

}
