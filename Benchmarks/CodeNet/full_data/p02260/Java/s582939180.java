import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m,c=0;
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int b=i;
			for(int j=i;j<n;j++){
				if(a[j]<a[b]){
					b=j;
				}
			}
			if(b!=i)
				c++;
			m=a[b];a[b]=a[i];a[i]=m;
		}
		for(int i=0;i<n;i++){
			if(i!=n-1)
				System.out.print(a[i]+" ");
			else
				System.out.print(a[i]);
		}
		System.out.println();
		System.out.print(c);
	}
}
