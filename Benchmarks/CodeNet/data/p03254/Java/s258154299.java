import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int x=scanner.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
			sum+=a[i];
		}
		Arrays.sort(a);
		if(sum==x) {
			System.out.println(a.length);
		}else if(sum<x) {
			System.out.println(a.length-1);
		}else {
			int cnt=0;
			for(int i=0;i<n;i++) {
				int tar=a[i];
				if(tar<=x) {
					x-=tar;
					cnt++;
				}else break;
			}
			System.out.println(cnt);
		}
	}
}	