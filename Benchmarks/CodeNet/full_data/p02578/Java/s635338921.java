import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int j = 1; j < n; j++) {
			if(a[j - 1] > a[j]){
				count += a[j - 1] - a[j];
				a[j] = a[j - 1];
			}
		}
		System.out.println(count);
	}
}