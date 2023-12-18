import java.util.*;
class string_m
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		
		
		for(int i=0;i<n;i++)
		{
		          arr[i]=sc.next();
		}
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		set.remove(null);
		System.out.println(set.size());


	}
}
