import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for (int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		
		for (int i=0;i<n;i++) {
			List<Integer> t_x = new ArrayList<>();
			for (int j=0;j<n;j++) {
				if (i==j) continue;
				t_x.add(x[j]);
			}
			Collections.sort(t_x);
			System.out.println(t_x.get((n/2)-1));
		}
	}
}
