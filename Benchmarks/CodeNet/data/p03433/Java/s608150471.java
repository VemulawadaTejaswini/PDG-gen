import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i =0 ;i<n;i++)
			arr[i] = s.nextInt();
		Arrays.sort(arr);
		long suma =0 ,sumb =0 ;
		for(int j =0 ;j<n;j++)
		{
			if(j%2 ==0 )
				suma+=arr[j];
			else
				sumb+=arr[j];
		}
		System.out.println(suma-sumb);
	}
}
