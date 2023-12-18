import java.io.*;
import java.util.*;
public class Main{
	static int n,w;
	static int[] weight=new int[101];
	static int[] cost=new int[101];
	static long[][] dp=new long[101][100001];
	public static long solve(int curr,int weig){
		if(curr==n)
			return 0;
		if(weig==0)
			return 0;
		long op1=0,op2=0;
		if(weight[curr]<=weig)
		op1=cost[curr]+solve(curr+1,weig-weight[curr]);

		op2=0+solve(curr+1,weig);
		return Math.max(op1,op2);

	}
	public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
        String str[]=br.readLine().split(" ");
		n=Integer.parseInt(str[0]); 
		w=Integer.parseInt(str[1]); 
		
		for(int i=0;i<n;i++){	
		str=br.readLine().split(" ");		
		   weight[i]=Integer.parseInt(str[0]);
		   cost[i]=Integer.parseInt(str[1]);
		}
		System.out.println(solve(0,w));
	}
    }
