
import java.util.*;
import java.math.*;
public class Main {
	
	
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

	    List<Long> n1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long d = sc.nextLong();
			n1.add(d);
		}
		long init = 0;
		
		for (int i = 2; i < n1.size(); i++) {
			init^=n1.get(i);
		}
		
		long ans = -1;
		
		
		for (int i = 0; i < ((n1.get(0))-1); i++)
		{
		if ( (init^ ((n1.get(0))-i)^((n1.get(1)) +i)) == 0 )
		{ans = i;break;}
		}
		System.out.println(ans);
	}
}