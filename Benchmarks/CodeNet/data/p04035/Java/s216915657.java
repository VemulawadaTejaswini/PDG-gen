import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int best =0;
		int index = -1;
		for(int i=0;i<n-1;i++) {
			if(a[i]+a[i+1] > best) {
				best = a[i]+a[i+1];
				index = (i+1);
			}
		}
		if(best<l) {
			System.out.println("Impossible");
			return;
		}
		System.out.println("Possible");
		for(int i=1;i<index;i++) {
			System.out.println(i);
		}
		for(int i=index+1;i<n;i++) {
			System.out.println(i);
		}
		System.out.println(index);
		
	}
}
