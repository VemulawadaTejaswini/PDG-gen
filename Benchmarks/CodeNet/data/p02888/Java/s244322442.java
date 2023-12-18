import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), count=0;
		int[] length = new int[n];
		for(int i=0;i<n;i++) length[i]=sc.nextInt();
		Arrays.sort(length);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n-1;j++) {
				int left=0,right=n-1, tar=length[i]+length[j];
				while(left+1<right) {
					int mid = (left+right)/2;
					if(length[mid]<tar) left = mid+1;
					else right=mid-1;
				}
				count+=left-j;
			}
		}
		System.out.println(count);
	}
}