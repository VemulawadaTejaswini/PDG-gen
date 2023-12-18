//C
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int height[] = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}
		
		int count[] = new int[n];
		for (int i = 0; i < m; i++) {
			int a_i = sc.nextInt() - 1;
			int b_i = sc.nextInt() - 1;
			if (height[a_i] <= height[b_i]) {
				count[a_i] = 1;
			}
			if (height[a_i] >= height[b_i]) {
				count[b_i] = 1;
			}
		}
		
		int countAll = 0;
		for (int i = 0; i < n; i++) {
			if (count[i] == 0) {
				countAll++;
			}
		}
		System.out.println(countAll);
	}
}