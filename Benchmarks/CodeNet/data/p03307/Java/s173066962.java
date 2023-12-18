

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0;
		long[] sums = new long[4];
		long[] a = new long[n];
		
		for(int i=0;i<n;i++) {
			long input = in.nextLong();
			sum = sum + input;
			a[i] = input;
		}
		
		long ave = sum/4;
		
		int[] lastIdx = new int[4];
		
		long min = Long.MAX_VALUE;
		
		for(int i=0;i<8;i++) {
			sums[0]=sums[1]=sums[2]=0;
			for(int j=0;j<3;j++) {
				if(j==0) lastIdx[j] = -1;
				else lastIdx[j] = lastIdx[j-1];
				if(((i>>j)&1)==0) {
					while(lastIdx[j]<n+j-4 && sums[j]+a[lastIdx[j]+1]<ave) {
						lastIdx[j]++;
						sums[j] = sums[j] + a[lastIdx[j]];
					}
				}else {
					while(lastIdx[j]<n+j-4 && sums[j]<ave) {
						lastIdx[j]++;
						sums[j] = sums[j] + a[lastIdx[j]];
					}
				}
			}
			sums[3] = sum - sums[0] - sums[1] - sums[2];
			long absDif = getAbsoluteDifference(sums);
			if(absDif<min) min=absDif;
		}
		
		for(int i=0;i<8;i++) {
			sums[3]=sums[1]=sums[2]=0;
			for(int j=3;j>0;j--) {
				if(j==0) lastIdx[j] = n;
				else lastIdx[j-1] = lastIdx[j];
				if(((i>>(3-j))&1)==0) {
					while(lastIdx[j]>j-2 && sums[j]+a[lastIdx[j]-1]<ave) {
						lastIdx[j]--;
						sums[j] = sums[j] + a[lastIdx[j]];
					}
				}else {
					while(lastIdx[j]<j-2 && sums[j]<ave) {
						lastIdx[j]--;
						sums[j] = sums[j] + a[lastIdx[j]];
					}
				}
			}
			sums[0] = sum - sums[3] - sums[1] - sums[2];
			long absDif = getAbsoluteDifference(sums);
			if(absDif<min) min=absDif;
		}
		System.out.println(min);
	}
	
	public static long getAbsoluteDifference(long[] sums) {
		long min = Math.min(Math.min(sums[0], sums[1]), Math.min(sums[2], sums[3]));
		long max = Math.max(Math.max(sums[0], sums[1]), Math.max(sums[2], sums[3]));
		return max - min;
	}

}
