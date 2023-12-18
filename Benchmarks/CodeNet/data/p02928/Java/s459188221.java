import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] a = new Integer[n];
//		int[] b = new int[n*k];
		
		long count = 0;
		long counta = 0;
		long countb = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					counta++;
				}
			}
		}
		
		Arrays.sort(a,Comparator.reverseOrder());
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					countb++;
				}
			}
		}
		
		count = (counta * k) + countb * (k * (k -1) / 2);
		count = count % ((long)Math.pow(10,9) + 7);
		System.out.println(count);
		
		sc.close();
	}
}