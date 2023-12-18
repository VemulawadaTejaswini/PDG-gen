import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		List<Integer> a = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			a.add(d);
		}
		for (int i = 0; i < N; i++) {
			int r = a.get(i+1);
			if ((i+1) == a.get(r)) ans++;
		}
		
		ans = ans/2;
		
	 
		System.out.println(ans);
	
	}
}
			