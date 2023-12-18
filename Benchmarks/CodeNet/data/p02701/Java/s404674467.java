import java.util.*;
class string_m
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[2*100000];
		for(int i=0;i<n;i++)
		{
		          str[i]=sc.next();
		}
		Set<String> set=new HashSet<>(Arrays.asList(str));
		System.out.println(set);
		set.remove(null);
		System.out.println(set.size());


	}
}
