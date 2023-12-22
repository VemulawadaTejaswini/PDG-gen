import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int h[] = new int[n];
		int a[] = new int[m];
		int b[] = new int[m];
		boolean  data[] = new boolean[n+1];
		int count =0;
		int max = 0;
		int min = 0;


		for (int i = 0;i<n ;i++ ) {
			h[i] = sc.nextInt();
		}
		for (int i = 0;i<m ;i++ ) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();

			if (h[a[i]-1]>h[b[i]-1]) {
				max = a[i];
				min = b[i];
			}else{
				max = b[i];
				min = a[i];
			}
			data[max] =true;
			data[min] = false;
		}

		for (int i = 1;i<n+1 ;i++ ) {
			if (data[i]==true) {
				count++;
			}
		}

		System.out.println(count);
	}
}
