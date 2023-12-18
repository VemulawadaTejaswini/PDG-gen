import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int result = 0;
		for (int i = 0; i < n; i++) {
			long temp = a[i];
			for (int j = 0; j < n; j++) {
				if(i != j) {
					if((2 * temp) >= a[j]) {
						temp = temp + a[j];
					}
					else {
						result++;
						break;
					}
				}
			}
		}
		result = n - result;
		System.out.println(result);
}
}
