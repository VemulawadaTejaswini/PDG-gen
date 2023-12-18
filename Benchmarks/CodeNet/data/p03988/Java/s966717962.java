import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0;
		int freq[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			max = Math.max(max,a[i]);
			freq[a[i]]++;
		}
		if(max==1) {
			if(n>2) {
				System.out.println("Impossible");
			}
			else {
				if(freq[1]!=2) {
					System.out.println("Impossible");
				}
				else {
					System.out.println("Possible");
				}
			}
			return;
		}
		if(max%2==0) {
			if(freq[max/2]!=1) {
				System.out.println("Impossible");
				return;
			}
			for(int i=0;i<max/2;i++) {
				if(freq[i]>0) {
					System.out.println("Impossible");
					return;
				}
			}
			for(int i=max/2+1;i<=max;i++) {
				if(freq[i]<2) {
					System.out.println("Impossible");
					return;
				}
			}
			System.out.println("Possible");
			return;
		}
		else {
			for(int i=0;i<(max+1)/2;i++) {
				if(freq[i]>0) {
					System.out.println("Impossible");
					return;
				}
			}
			for(int i=(max+1)/2;i<=max;i++) {
				if(freq[i]<2) {
					System.out.println("Impossible");
					return;
				}
			}
			System.out.println("Possible");
			return;
		}
	}
}
