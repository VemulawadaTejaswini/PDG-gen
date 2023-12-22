import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 999;
		
		List<Integer> subArray = new ArrayList<>();
		
		while(sum != 0) {
			sum = sc.nextInt();
			
			if(sum == 0) {
				break;
			}
			
			int deSum = 0;
			
			for(int i = 0; i < 9; i++) {
				deSum+=sc.nextInt();
			}
			
			subArray.add(sum - deSum);
		}
		
		for(int i = 0; i < subArray.size(); i++) {
			System.out.println(subArray.get(i));
		}
	}
}