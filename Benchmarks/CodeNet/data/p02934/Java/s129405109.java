import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		long sum=0,prod=1;
		for(int i = 0;i <n ; i++ ){
			prod*=arr[i];
		}
		for(int i=0;i<n;i++)		{
			sum+=(prod/arr[i]);
		}
		double num = ( double) prod;
		double den = ( double) sum;
		System.out.println(num/den);
	}
}