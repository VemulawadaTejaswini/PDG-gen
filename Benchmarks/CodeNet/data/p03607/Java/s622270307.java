import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main 
{
 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++)
		{
			int a_i=sc.nextInt();			
			int index= binary_search(A,a_i,0,A.size()-1);			
			if(index==-1)
			{
				A.add(a_i);
			}
			else
			{
				A.remove(index);
			}
		}
		sc.close();
		
		System.out.println(A.size());
	}
	
	final static int KEY_NOT_FOUND =-1;
	
	static int binary_search(ArrayList<Integer> list, int key, int imin, int imax) 
	{
	    if (imax < imin) 
	    {
	        return KEY_NOT_FOUND;
	    }
	    else
	    {
	        int imid = imin + (imax - imin) / 2;
	        if (list.get(imid) > key)
	        {
	            return binary_search(list, key, imin, imid - 1);
	        }
	        else if (list.get(imid) < key)
	        {
	            return binary_search(list, key, imid + 1, imax);
	        }
	        else
	        {
	            return imid;
	        }
	    }
	}
}
