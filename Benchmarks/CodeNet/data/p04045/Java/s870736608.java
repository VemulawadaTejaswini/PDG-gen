import java.util.*;
public class Main {
	public static boolean contains(int n, int []arr) {
		while(n > 0) {
			int a = n % 10;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == a) {
					return true;
				}
			}
			n /= 10;
		}
		return false;
	}
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[k];
		for(int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}

		while(true) {
			if(contains(n, arr)) {
				n++;
			}
			else {
				break;
			}
		}
		System.out.println(n);
	}
}