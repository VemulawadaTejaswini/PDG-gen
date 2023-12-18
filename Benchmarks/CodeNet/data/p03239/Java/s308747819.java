import java.util.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int T=in.nextInt();
		
		int com=1001;
		while(in.hasNext()){
		    int n=in.nextInt();
		    int t=in.nextInt();
		    if(t>T)
		        continue;
		    else
		    {
		       if(n<=com) com=n;
		       
		    }     
		       
		}
	
		if(com==1001) System.out.println("TLE");
		else System.out.println(com);
		
	}
}