import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = in.nextInt();
			b[i] = array[i];
		}
		in.close();
		Arrays.sort(b);
		long m = n*(n+1)/2;
		int l = 0;
		int r = n;
		int x = b[n/2];
		while(r-l>1) {
			x = b[(r+l)/2];
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				if(array[i]>=x) a[i] = 1;
				else a[i] = -1;
			}
			int[] sum = new int[n+1];
			int max = 0;
			int min = 0;
			for(int i=0;i<n;i++) {
				sum[i+1] = sum[i] + a[i];
				if(sum[i+1]>max) max = sum[i+1];
				if(sum[i+1]<min) min = sum[i+1];
			}
			long count = 0;
			int[] bit = new int[max-min+1];
			for(int i=0;i<n+1;i++) {
				count += bitGetSum(bit, sum[i]-min);
				bitAdd(bit, sum[i]-min, 1);
			}
			if(count>=(m+1)/2) l += (r-l)/2;
			else r -= (r-l)/2;
		}
		System.out.println(b[l]);
	}
	
	
	public static int bitGetSum(int[] bit,int idx) {
		idx++;
		int ans = 0;
		for(;idx>0;idx-=(idx&-idx)) {
			ans += bit[idx-1];
		}
		return ans;
	}
	
	public static void bitAdd(int[] bit,int idx,int num) {
		idx++;
		for(;idx<=bit.length;idx+=(idx&-idx)) {
			bit[idx-1] += num;
		}
	}

}
