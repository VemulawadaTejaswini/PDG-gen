import java.util.Arrays;
import java.util.Scanner;

public class Barbeque {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[2*n];
		for(int i=0;i<2*n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		for(int j=0;j<2*n;j=j+2) {
			sum=sum+Math.min(arr[j], arr[j+1]);
			
		}
		System.out.println(sum);
sc.close();
	}

}
