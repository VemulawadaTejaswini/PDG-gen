import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		int num=0;
		
		for(int i=0;i<n;++i) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double ave=(double)sum/n;
		for(int i=0;i<n;++i) {
			if(Math.abs(a[num]-ave)>Math.abs(a[i]-ave))num=i;
		}
		
		System.out.println(num);
		
	}
}