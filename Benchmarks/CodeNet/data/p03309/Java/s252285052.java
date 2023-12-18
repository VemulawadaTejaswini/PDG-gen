import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] map = new int[N];
		int totalP = 0;
		int countP = 0;
		int totalN = 0;
		int countN = 0;
		int countZ = 0;
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt() - (i + 1);
			if (map[i] > 0) {
				totalP += map[i];
				countP++;
			} else if (map[i] < 0) {
				totalN += map[i];
				countN++;
			} else {
				countZ++;
			}
		}
		
		//input3 OK
		if (totalP == Math.abs(totalN)) {
			System.out.println(totalP * 2);
			return;
		}
		
		Arrays.sort(map);
		
		if (countP > countN) {
			int start = Arrays.binarySearch(map, 0);
			start = start < 0 ? Math.abs(start + 1) : start;
			
			float total = 0F;
			int totalC = 0;
			for (int i = start; i < N; i++) {
				total += map[i];
				totalC++;
			}
			int val = Math.round(total / totalC);
			
			if (val <= countZ) {
				val = 0;
			} 
			
			int ans = 0;
			for (int i = 0; i < N; i++) {
				ans += Math.abs(map[i] + val);
			}
			System.out.println(ans);
		} else {
			int start = Arrays.binarySearch(map, 0);
			start = start < 0 ? Math.abs(start + 1) - 1 : start - 1;
			
			float total = 0F;
			int totalC = 0;
			for (int i = start; i >= 0; i--) {
				total += map[i];
				totalC++;
			}
			int val = Math.round(Math.abs(total / totalC));
			
			if (val <= countZ) {
				val = 0;
			}
			
			int ans = 0;
			for (int i = 0; i < N; i++) {
				ans += Math.abs(map[i] + val);
			}
			System.out.println(ans);
		}
	}
}