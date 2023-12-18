import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int c=0;
		for(int i=0;i<n-2;i++){
			if((arr[i+1]>arr[i]&&arr[i+1]<arr[i+2])||(arr[i+1]<arr[i]&&arr[i+1]>arr[i+2]))
				c++;
		}
		System.out.println(c);
	}
}