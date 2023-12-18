import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double[] arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]= (sc.nextDouble()+1)/2;
		}
		double max=0;
		double sum=0;
		for(int i=0;i<n-k+1;i++) {
			for(int j=i;j<k+i;j++) {
				sum=sum+arr[j];
			}
			if(sum>max) {
				max=sum;}
			sum=0;
		}
		System.out.println(max);
	}

}
