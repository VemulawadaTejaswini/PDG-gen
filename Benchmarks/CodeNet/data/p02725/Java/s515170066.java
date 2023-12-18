import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 	int k = sc.nextInt();
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;

			for (int i = 0;i<n ;i++ ) {
				a[i] = sc.nextInt();
			}

			int max = Math.max(a[0],k-a[n-1]);

			for (int i = 0;i<n ;i++ ) {
				max = Math.max(max,a[i-1]-a[i]);
			}



			if (max==a[0]) {
				System.out.println(k-max-a[n-1]);
			}else if (max==a[n+1]){
				System.out.println(k-max-a[0]);
			}else{
				System.out.println(k-max);
			}


	}
}
