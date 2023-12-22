
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
	    List<Integer> n2 = new ArrayList<>();
		List<Integer> m2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			if(i>0) d = d + n2.get(i-1);
			n2.add(d);
		}
		for (int i = 0; i < M; i++) {
            int d = sc.nextInt();
			if(i>0) d = d + m2.get(i-1);
			m2.add(d);
		}
		int count = 0;
		int ans = 0;
		
		for (int i = 0 ; i < n2.size(); i++ )
		
          if ((n2.get(i) <= K))
          {
			while  (m2.get(M-1) > (K-n2.get(i)) )
			{
				M--;
			}
			ans = Math.max(ans,i+M+1) ;
			
		}
	
		System.out.println(ans);
   
        }
		
	}
 