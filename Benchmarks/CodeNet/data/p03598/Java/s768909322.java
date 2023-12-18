import java.util.Scanner;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[] = new int[100001];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int temp=Math.min(arr[i], k-arr[i]);
			ans = ans+temp;
		}
		System.out.println(ans); 
	}

}
