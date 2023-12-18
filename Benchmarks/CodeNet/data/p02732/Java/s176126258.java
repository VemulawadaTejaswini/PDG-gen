import java.util.HashMap;
import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
			if(h.containsKey(a[i])) {
				h.put(a[i], h.get(a[i])+1);
			}
			else {
				h.put(a[i],1);
			}
		}
		
	
		
		long sum = 0;
		for(int i:h.keySet()) {
			sum+=(h.get(i)*(h.get(i)-1))/2;
		}
		
		for(int i=0;i<n;i++) {
			int a1 = h.get(a[i]);
			long ans = sum-((a1)*(a1-1))/2+((a1-1)*(a1-2))/2;
			System.out.println(ans);
		}
		
		
		
		
	}
}