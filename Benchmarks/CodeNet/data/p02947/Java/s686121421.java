
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static boolean cont(ArrayList<elem> dist, elem i)
	{
		boolean ans = false;
		int ind = 0;int indc = -1;;
		for (elem j:dist)
		{
			if (j.st.compareTo(i.st)==0)
			{
				ans= true;indc = ind;
			}ind++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk = new Scanner(System.in);
		int n = jk.nextInt();
		ArrayList<elem> arr = new ArrayList<elem>();
		jk.nextLine();
		for (int i=0; i<n; i++)
		{
			char tempArray[] = jk.nextLine().toCharArray(); 
	        Arrays.sort(tempArray);
	        String hj = Arrays.toString(tempArray);
	        elem rt = new elem(hj);
	        arr.add(rt);
		}
		//ystem.out.print(arr.size());
		ArrayList<elem> dist = new ArrayList<elem>();
		for (elem i:arr)
		{
			if (cont(dist,i))
			{
				for (int j=0; j<dist.size(); j++)
				{
					if (dist.get(j).st.compareTo(i.st)==0)
					{
						dist.get(j).incr();
					}
				}
			}
			else
			{
				dist.add(i);
			}
		}
		int ans = 0;
		for (elem i:dist)
		{
			int l = i.num-1;
			ans+=(int) l*(l+1)/2;
		}
		System.out.println(ans);
	}

}

class elem
{
	String st;
	int num;
	public elem(String op)
	{
		this.st = op;
		this.num = 1;
	}
	public void incr()
	{
		this.num++;
	}
}
