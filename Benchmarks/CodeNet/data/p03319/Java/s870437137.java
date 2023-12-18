
import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<Integer> a = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			a.add(d);
		}
		
		int key = a.indexOf(1);
		int re = N - key - 1;
        int div = K - 1;
        int yu = 0;
      if (key % div !=0) yu++;
      if (re % div !=0) yu++;
    
		
		int ans = (key / div) + (re / div) + yu ;
		if (N==K) ans=1;
	 
		System.out.println(ans);
	
	}
}
			
			