import java.util.*;
public class reverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
     	int n=input.nextInt(),sum=0;
     	 
    for(int i=1;i<=n;i++)
    {
    	sum=sum+i;
	}
    	System.out.println("the sum of all candles is " + sum);
	}
	}