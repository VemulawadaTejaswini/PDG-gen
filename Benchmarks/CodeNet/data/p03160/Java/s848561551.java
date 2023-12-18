import java.util.Scanner;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	public static int findMinCost(int arr[],int n){
		if(n>=arr.length)
			return Integer.MAX_VALUE;
		if(n==arr.length-1)
			return 0;
		int n1=n+2<arr.length?findMinCost(arr,n+2)+Math.abs(arr[n]-arr[n+2]):Integer.MAX_VALUE;
		int n2=n+1<arr.length?findMinCost(arr,n+1)+Math.abs(arr[n]-arr[n+1]):Integer.MAX_VALUE;
		return Math.min(n1,n2);
	}
	
	public static void main(String []args){
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(findMinCost(arr,0));
	}
}