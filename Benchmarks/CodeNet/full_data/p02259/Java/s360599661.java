import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int n=in.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=n-1;j>=i+1;j--){
				if(a[j]<a[j-1]){
					count++;
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(i==n-1)
				out.printf(a[i]+"\n");
			else
				out.print(a[i]+" ");
		}
		out.println(count);

	}
}
