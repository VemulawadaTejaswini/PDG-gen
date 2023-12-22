import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n+m==0) {
				break;
			}
			int[] a = new int[n];
			int[] b = new int[m];
			int sum_a = 0;
			int sum_b = 0;
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				sum_a += a[i];
			}
			for(int i=0;i<m;i++) {
				b[i] = sc.nextInt();
				sum_b += b[i];
			}
			if ((sum_b-sum_a+100)%2 == 1) {
				System.out.println(-1);
				continue;
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int i=0,j=0;
			boolean flag = false;
			while(i < n && j < m) {
				//System.out.println(a[i] + "," + b[j] + "," + (sum_b-sum_a));
				int diff1 = a[i] - b[j];
				int diff2 = (sum_a-sum_b)/2;
				if (diff1 == diff2) {
					flag = true;
					break;
				}else if(diff1 < diff2) {
					i++;
				}else{
					j++;
				}
			}
			if (flag) {
				System.out.println(a[i] + " " + b[j]);
			}else{
				System.out.println(-1);
			}
		}
	}

}