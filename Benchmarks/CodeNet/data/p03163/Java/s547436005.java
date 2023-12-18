


import java.util.Scanner;
public class Main{
 
	public static long calculate(int wt[],long profit[],int totalWt,int i)
	{
		if(i>=wt.length)
			return 0;
		if(wt[i]<=totalWt)
		return Math.max(profit[i]+calculate(wt,profit,totalWt-wt[i],i+1),
				calculate(wt,profit,totalWt,i+1));
		else
			return calculate(wt,profit,totalWt,i+1);
	}
   
  public static void main(String[] args)
  {
     
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int totalWt=s.nextInt();
    int wt[]=new int[n];
    long profit[]=new long[n];
    
    for(int i=0;i<n;i++ )
    {
    	wt[i]=s.nextInt();
    	profit[i]=s.nextLong();
    }
    System.out.println(calculate(wt,profit,totalWt,0));
    
    s.close();
    
  }
}