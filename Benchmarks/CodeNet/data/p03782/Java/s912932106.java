import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[n];
		
		for (int i =0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int sum = 0;
		int result = a.length;
		for (int i = a.length-1; i >= 0; i--) {
			if(a[i] >= k) {
				continue;
			}
			sum += a[i];
			if(sum >= k) {
				if(i>0){
					result = i;
					break;
				}
				
			}
		}
		System.out.println(result);

	}

}

