import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> s = new HashSet<String>();
		int[] d = new int[1+n];
		for(int i=0; i<n-1; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			s.add(x+" "+y);
			s.add(y+" "+x);
			d[x] ++;
			d[y] ++;
		}
		
		boolean f = false;
		for(int i=1; i<=n ;i++) {
			if(d[i] <= 2)	continue;
			int t = 0;
			for(int j=1; j<=n; j++) {
				if(s.contains(i+" "+j) && d[j] == 1)
					t ++;
			}
			if(t >= 2)	{
				f = true;
				break;
			}
		}
		
		if(f) 	System.out.println("First");
		else	System.out.println("Second");
	}
	
}
