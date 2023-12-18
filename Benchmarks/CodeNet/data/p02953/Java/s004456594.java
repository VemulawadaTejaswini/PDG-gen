import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int max=(int)-1e9;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			max=Math.max(max, arr[i]);
		}
		if(max==arr[n-1])
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
