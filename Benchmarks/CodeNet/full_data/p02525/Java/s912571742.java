import java.util.Scanner;
//import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s[]= new int[1000];
		int sum=0;
		int sqsum=0;
		double ave,stndrd=(double)0;
		for (int i=0;i<n;i++) {
			s[i]=in.nextInt();
			sum+=s[i];
		}
		for (int k=0;k<n ;k++ ) {
			sqsum+=s[k]*s[k];
		}
		ave=(double)sum/n;
		stndrd=Math.sqrt((double)sqsum/n-ave*ave);
		System.out.printf("%f%n",stndrd);
	}
}