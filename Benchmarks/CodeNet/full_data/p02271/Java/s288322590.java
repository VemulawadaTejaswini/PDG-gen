import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] A = new int[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		
		int[] m = new int[q];
		
		for(int i = 0; i < q; i++) {
			m[i] = sc.nextInt();
		}
		
		List<Integer> sum = new ArrayList<>();
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				sum.add(A[i] + A[j]);
			}
		}
		
		int flag = 0;
		
		for(int i = 0; i < q; i++) {
			for(int j = 0; j < sum.size(); j++) {
				if(m[i] == sum.get(j)) {
					System.out.println("yes");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("no");
			}
			
			flag = 0;
		}
	}
}