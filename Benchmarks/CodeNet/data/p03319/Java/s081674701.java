
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
      
      
		int re = N - 1;
        int div = K - 1;
        int yu = 0;
        if (re % div !=0) yu++;
    
    
		
		int ans = (re / div) + yu ;
	 
		System.out.println(ans);
	
	}
}
			