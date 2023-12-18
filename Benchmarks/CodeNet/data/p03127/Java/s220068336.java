import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		int remain = 0;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i; j < a.length; j++) {
				remain = a[j] % a[i];
				if (remain==0) {
					min = Integer.min(min,a[i]);
				} else {
					min = Integer.min(min, a[i] - remain);
				}
				
			}
		}
		System.out.println(min);
		
		
		sc.close();
	}
}