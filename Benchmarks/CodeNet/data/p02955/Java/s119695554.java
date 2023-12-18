import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
			sum += a[i];
		}
		List<Integer> list = new ArrayList<>();
		for(int i=1;i*i<=sum;i++) {
			if(sum%i==0) {
				if(i*i==sum) list.add(i);
				else {
					list.add(i);
					list.add(sum/i);
				}	
			}
		}
		list.sort((e1,e2)->-e1+e2);
		int ans = 0;
		for(int num : list) {
			if(num==1) ans = 1;
			else {
				int[] b = new int[n];
				int sum2 = 0;
				for(int i=0;i<n;i++) {
					b[i] = a[i]%num;
					sum2 += num-b[i];
				}
				Arrays.sort(b);
				int sum3 = 0;
				int idx = 0;
				while(sum2!=sum3) {
					sum2 -= num-b[idx];
					sum3 += b[idx];
					idx++;
				}
				if(sum2<=k) {
					ans = num;
					break;
				}
			}
		}
		System.out.println(ans);
		
		
		in.close();

	}

}
