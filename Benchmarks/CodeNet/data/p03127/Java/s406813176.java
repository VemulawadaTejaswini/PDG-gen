import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
			
			if (map[i] == 1) {
				System.out.println(1);
				return;
			}
		}
		
		Arrays.sort(map);
		
		int index = 1;
		long min = map[0];
		while (index < N && map[index] % min < min && map[index] % min != 0) {
			min = map[index] % min;
			index++;
			
			if (min == 1) {
				System.out.println(1);
				return;
			}
		}
		
		System.out.println(min);
	}
	
}
