import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    //a+b,b+c,c+aがkの倍数ということはmodK=0となるということ。
		    //とりあえずNとKを読み込む
		    int N = scanner.nextInt();
		    int K = scanner.nextInt();
		    int n = N / K;
		    int kotae = n*(n-1)*(n-2)
					+n*(n-1)*3
					+n;
		    
		    if( K % 2 != 0) 
		    {
		    	System.out.println(kotae);
		    }
		    else 
		    {
		    	if(N % K == 0) 
		    	{
		    		System.out.println(kotae*2);
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