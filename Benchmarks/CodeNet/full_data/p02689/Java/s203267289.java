import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		TreeMap<Integer, Integer> yoi = new TreeMap<>();
		int total = 0;

		for(int i = 0; i < n; i++) {
			h[i]= sc.nextInt();
			yoi.put(i+1,1);
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(h[a-1] > h[b-1]) {
				yoi.put(b,0);
			} else {
				yoi.put(a,0);
			}
		}

		for (Integer key : yoi.keySet()) {
			total += yoi.get(key);
		}
		
		System.out.println(total);
	}
}
