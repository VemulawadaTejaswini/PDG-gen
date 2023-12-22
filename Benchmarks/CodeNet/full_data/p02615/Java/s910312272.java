import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Long[] arr;
		n=sc.nextInt();
		arr=new Long[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLong();
		Arrays.sort(arr,Collections.reverseOrder());
		long sum=0;
		sum+=arr[0];
		for(int i=2;i<n;i++) {
			sum+=Math.min(arr[i-1], arr[i-2]);
		}
		System.out.println(sum);
	}
}