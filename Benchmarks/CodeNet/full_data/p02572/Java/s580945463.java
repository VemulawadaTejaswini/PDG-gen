import java.util.Arrays;
import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long[] arr=new long[(int)n];
		long[] arr1=new long[(int)n];
		Arrays.fill(arr, 0);
		Arrays.fill(arr1, 0);
		arr[0]=sc.nextInt();
		arr[0]=arr[0];
		long sum=0;
		for(int i=1;i<n;i++)
		{
			arr[i]=sc.nextInt();
			arr1[i]=arr1[i-1]+arr[i];
		}
		
		long num=(int)(Math.pow(10, 9))+7;
		for(int i=0;i<n;i++)
		{
			sum+=(((arr1[(int)n-1]-arr1[(int)i])%num)*arr[(int)i])%num;
		}
		System.out.println(sum%num);
	}

}
