
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] gems = new int[N];
		int result = 0;
		int min = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				gems[i] = sc.nextInt();
				result += Math.abs(gems[i]);
				if (i == 0 || min > Math.abs(gems[i])) {
					min = Math.abs(gems[i]);
				}
				if (gems[i] <= 0) {
					count++;
				}
			}
		}
				
		if (count == 0 || count%2 == 0) {
			System.out.println(result);
		} else {
			System.out.println(result-2*min);
		}
		
	}

}