

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] sums = new long[n];
		sums[0] = in.nextLong();
		for(int i=1;i<n;i++) {
			sums[i] = sums[i-1] + in.nextLong();
		}
		long min = Long.MAX_VALUE;
		int left = 0;
		int right = 2;
		for(int i=1;i<=n-2;i++) {
			left = cutLeft(sums,left,i);
			right = cutRight(sums,i,right,n-1);
			long absdif = getAbsoluteDifference(sums[left], sums[i]-sums[left], sums[right]-sums[i], sums[n-1]-sums[right]);
			if(absdif<min) min = absdif;
		}
		System.out.println(min);
	}
	
	public static int cutLeft(long[] sums,int left,int end) {
		long dif = abs(sums[end]-sums[left],sums[left]);
		while(left<end-1) {
			long newDif = abs(sums[end]-sums[left+1],sums[left+1]);
			if(newDif<dif) {
				dif = newDif;
				left++;
			}else {
				break;
			}
		}
		return left;
	}
	
	public static int cutRight(long[] sums,int i,int right,int end) {
		long dif = abs(sums[end]-sums[right],sums[right]-sums[i]);
		while(right<end-1) {
			long newDif = abs(sums[end]-sums[right+1],sums[right+1]-sums[i]);
			if(newDif<dif) {
				dif = newDif;
				right++;
			}else {
				break;
			}
		}
		return right;
	}
	
	public static long abs(long a,long b) {
		if(a>b) return a-b;
		return b-a;
	}
	
	public static long getAbsoluteDifference(long cut1,long cut2,long cut3,long cut4) {
		long min = Math.min(Math.min(cut1, cut2), Math.min(cut3, cut4));
		long max = Math.max(Math.max(cut1, cut2), Math.max(cut3, cut4));
		return max - min;
	}

}
