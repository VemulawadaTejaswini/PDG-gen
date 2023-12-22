
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
			int c=0;
			int i=0;
			boolean f=true;
			for(i=0;i<=x+100;i++) {
				if(x-i!=a[j-c]) {

					break;
				}else if(x+i!=a[j+c]) {
					f=false;
				    break;
				}else {
					if(c+j<n-1&&j-c>0)
					    c++;
				}
			}

			if(f) {
				System.out.println(x-i);
			}else {
				System.out.println(x+i);
			}
		}





	}

}
