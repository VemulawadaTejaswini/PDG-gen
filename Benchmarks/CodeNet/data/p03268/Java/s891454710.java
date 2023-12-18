import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int K = scanner.nextInt();
		    int n = N / K;
		    int kotae = n*(n-1)*(n-2)
							+n*(n-1)*3
								+n;
		    //(これはn/k枚の方。)
		    
		    if( K % 2 != 0) //==0のやつを三つ。
		    {
		    	System.out.println(kotae);
		    }
		    else //k/2を三つでもいい。
		    {
		    	if(N % K == 0) //存在しない。
		    	{
		    		System.out.println(kotae);
		    	}
		    	else {
		    			if( K / 2 <= N % K  ) 
		    			{
		    			int kotae2 = (n+1)*n*(n-1)+3*(n+1)*n+n+1;
		    			System.out.println(kotae+kotae2);
		    		}
		    		else 
		    		{
		    		System.out.println(2*kotae);
		    		}
		    	}
		    }
		    
		    scanner.close(); }
		  }