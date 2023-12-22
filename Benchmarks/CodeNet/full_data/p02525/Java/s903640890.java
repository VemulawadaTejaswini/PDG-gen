import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<Double> reslt=new ArrayList<Double> ();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s[]= new int[1000];
		int sum=0;
		int sqsum=0;
		while(n!=0){
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
			reslt.add(stndrd);
			sum=0;
			sqsum=0;
			n=in.nextInt();
		}
		for (int j=0;j<reslt.size();j++) {
			System.out.printf("%e%n",reslt.get(j));
		}
	}
}