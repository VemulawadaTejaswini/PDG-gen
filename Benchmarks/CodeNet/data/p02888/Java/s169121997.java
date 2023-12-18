
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			max=Math.max(a[i],max);
		}
		Arrays.parallelSort(a);

		int c=0;
		for(int x=0;x<n-2;x++) {
			for(int y=x+1;y<n-1;y++) {
				int max2=Math.max(a[x]-a[y], a[y]-a[x]);
				if(max>=max2&&max2<a[x]+a[y]) {
				for(int z=n-1;z>y;z--) {
					if(a[x]<a[y]+a[z]&&a[y]<a[z]+a[x]&&a[z]<a[y]+a[x])
						c++;
					if(a[z]<max2)
						break;
				}
				}
			}
		}
		System.out.println(c);

	}

}
