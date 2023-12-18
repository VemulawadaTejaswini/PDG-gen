import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      int[] a,b,c;
		a = new int[n];
		b = new int[n];
		c = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(c);
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			int b2 = b[i];
			int right = n; //使用値 + 1
			int left = -1;
			while(right - left > 1) {
	            // mid
	            int mid = (left + right) / 2;
	            if(a[mid] >= b2) { //判定
	            	right = mid;
	            }
	            else {
	            	left = mid;
	            }
	        }
			int count_a = left + 1;  //必ずLeft
			right = n;
			left = -1;
			while (right - left > 1) {
	            // mid
	            int mid = (right + left) / 2;
	            if(c[mid] <= b2) {
	            	left = mid;
	            }
	            else
	            	right = mid;
	        }
			int count_c = n - (left + 1);
			count += count_a * count_c;
		}

		sc.close();
		System.out.println(count);

	}
}

