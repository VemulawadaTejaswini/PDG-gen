import java.util.*;
import java.math.*;
public class Main {
	
	
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        long init = 0;
      long n1 = sc.nextLong();
      long n2 = sc.nextLong();

	    //List<Long> n1 = new ArrayList<>();

        for (int i = 2; i < N; i++) {
            long d = sc.nextLong();
           init^=d;
		}
		
		
		long ans = -1;
		
		for (int i = 0; i < (n1-1); i++)
		{
		if ( (init^ (n1-i)^(n2+i)) == 0 )
		{ans = i;break;}
		}
		System.out.println(ans);
	}
}