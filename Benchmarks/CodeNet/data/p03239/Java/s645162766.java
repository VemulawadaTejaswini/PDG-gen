import java.util.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int T=in.nextInt();
		//int n=0;
		/*int n[]=new int[N];
		int t[]=new int[N];
		for(int i=0;i<N;i++)*/
		int com=1000;
		while(in.hasNext()){
		    int n=in.nextInt();
		    int t=in.nextInt();
		    if(t>T)
		        continue;
		    else
		    {
		       if(n<com) com=n;
		    }     
		       
		}
		if(com==1000) System.out.println("TLE");
		else System.out.println(com);
		
	}
}