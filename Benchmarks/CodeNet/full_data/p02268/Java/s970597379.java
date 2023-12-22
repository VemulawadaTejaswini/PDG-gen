
import java.util.Scanner;

public class Main {
	
	static int search(int[] a, int key) {
		int left=0, right=a.length;
		int mid;
		while (left < right) {
			mid = (left+right) / 2;
			if (key == a[mid]) return mid;
			if (key > a[mid]) left = mid+1;
			else if (key < a[mid]) right = mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		int q = sc.nextInt();
		for (int i=0; i<q; i++) {
			int key = sc.nextInt();
			if (search(a, key) >= 0)
				sum ++;
		}
		
		sc.close();
		
		System.out.println(sum);
	}

}

