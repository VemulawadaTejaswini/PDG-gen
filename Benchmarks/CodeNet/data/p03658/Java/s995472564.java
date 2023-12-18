import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,max=0,mi=0;
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++) {
			for(int j=0;j<n;j++) {
				if(max<a[j]) {
					max=a[j];
					mi=j;
				}
			}
			sum += max;
			max=0;
			a[mi]=0;
		}
		System.out.print(sum);
		sc.close();
	}
}