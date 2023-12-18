import java.util.Scanner;
	public class Main
		{ public static void main(String[] args)
			{   
			    Scanner scanner = new Scanner(System.in);
			    int N = scanner.nextInt();
			    int M = scanner.nextInt();
				long y = 1;
				long x = 1;
				
				long sum = 0;
				
			    if ((0<= M-N&&M-N <=1)||(0<= N-M&&N-M <=1)) {
			    	if ((M-N==0)||(N-M ==0)) {
			    		for(int i=1;i<=N;i++){
			    		 y= i*y;
			    		}
						sum = y*y*2;
			    	} else {
			    		for(int i=1;i<=N;i++){
			    		 y= i*y;
			    		}
			    		for(int i=1;i<=M;i++){
			    		 x= i*x;
			    		}
			    		sum=x*y;
			    	}
			    } else {
			    	sum = 0;
			    }
			    System.out.println(sum);
				System.out.println(sum%(10^9+7));
		}
		}
		