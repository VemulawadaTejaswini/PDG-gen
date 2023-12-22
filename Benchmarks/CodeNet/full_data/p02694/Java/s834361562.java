import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
		long X = Long.valueOf(x);
		double arg = 100;
		int ans = 0;

        while(arg < X) {
			arg = Math.floor(arg * 1.01);
			ans++;
        }

		System.out.println(ans);

        sc.close();
    }    
}
