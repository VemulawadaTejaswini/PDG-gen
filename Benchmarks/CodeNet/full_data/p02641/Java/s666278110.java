 import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(n==0) {
			System.out.println(x);

		}else {
			Arrays.sort(a);

			int j=0;
			int p=100;
			int q=100;
			for(j=0;a[j]<x;j++) {

			}
			int h=j;
			for(int i=x;i<2000;i++) {
				if(i!=a[j]) {
					p=i;
					break;
				}else {
					if(j<n-1)
					    j++;
				}

			}

			for(int i=x;i>=x-Math.abs(x-p);i--) {
				if(i!=a[h]) {
					q=i;
					break;
				}else {
					if(h>0)
					   h--;
				}
			}

			if(Math.abs(x-p)>=Math.abs(x-q))
			    System.out.println(q);
			else
				System.out.println(p);
		}





	}

}
