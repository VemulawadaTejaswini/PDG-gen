import java.util.*;

public class Main {

	

	static int k;
	static int arr[];
	static int n;
	static int ind;
	public static void main(String[] args)
	{
		ind=0;
		Scanner sc=new Scanner(System.in);
	      n=sc.nextInt();
	      k=sc.nextInt();
	     arr=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	    	 
	     }
	     int tt=k;
	     int ans=rec(0,tt);
	     if(ans==1)
	     {
	    	 System.out.println("First");
	     }else {
	    	 System.out.println("Second");
	     }
	}
	private static int rec(int chance, int tt) {
		// TODO Auto-generated method stub
		//System.out.println(tt+" "+chance);
		if(tt==0)
		{
			return chance==0?2:1;
		}
		int ans=chance== 0 ? 2:1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<=tt)
			{
				
				ans=rec(chance^1,tt-arr[i]);
				
			}
			//System.out.println(tt+" "+chance+" "+ans+" "+i);
			if(chance==0&&ans==1)
			{
				return 1;
				
			}
			if(chance==1&&ans==2)
			{
				return 2;
			}
		}
		return ans;
	}
	
	
	
}
