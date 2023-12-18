import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),max=Integer.MIN_VALUE;
		int[] a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=1;i<=a[n-1];i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(i>=a[j]-1 && i<=a[j]+1)count++;
			}
			max=Math.max(max, count);
		}

		System.out.println(max);
	}
}

