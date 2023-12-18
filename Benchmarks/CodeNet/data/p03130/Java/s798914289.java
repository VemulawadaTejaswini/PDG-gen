import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] count = new int[4];
		for(int i=0;i<6;i++) {
			int node = sc.nextInt();
			count[node-1]++;
		}
		for(int x : count) {
			if(x>2) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
