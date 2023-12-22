package Atcoder;
import java.util.Arrays;
import java.util.Scanner;;
public class  D{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=Integer.parseInt(sc.next());
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(sc.next());
		Arrays.sort(a);
		int c=0;
		int x=a[n-1];
			for(int i=0;i<n-1&&a[i]<x/2;i++) {
				if(a[i]==0)
					continue;
				int f=0;

				for(int j=i+1;j<n;j++) {
					if(a[j]%a[i]==0) {
						if(a[i]==a[j])
							f=1;
						a[j]=0;

					}
				}

				if(f==1) {
					a[i]=0;
				}
		    }
			for(int i=0;i<n;i++) {
				if(a[i]!=0)
					c++;
			}
			System.out.println(c);



	}

}