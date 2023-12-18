
import java.util.Scanner;

public class Main {


		public static void main(String[] agrs)
		{
			Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
		
			int min = c*d/change(c,d);
			System.out.println(b-a+1-(b/c-(a-1)/c+b/d-(a-1)/d-b/min+(a-1)/min));
		
		}
	    public static int change(int i,int j) {

	        	int k=0;
	        	k=j%i;
	        	if(k==0)
	        		return i;
	        	return change(k,i);
	    }
	}

