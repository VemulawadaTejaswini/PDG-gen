import java.util.*;
class string_m
{
	public static void main(String args[])
	{
		String arr[]=new String[2*100000];
		Scanner sc=new Scanner(System.in);
		int count=1;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		          arr[i]=sc.next();
		}
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		set.remove(null);
		System.out.println(set.size());


	}
}
