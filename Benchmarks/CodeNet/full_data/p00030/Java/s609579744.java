import java.util.*;
import java.lang.*;

public class Main {
    public static int cnt = 0;
    public static int n, s;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        for(;;) {
            cnt = 0;
            n = num.nextInt();
            s = num.nextInt();

            if(n == 0 && s == 0) break;

            calc(0, 0, 0);
            System.out.println(cnt);
        }
    }

    public static void calc(int i, int sum, int N) {
        if(sum == s && N == n){
			cnt++;
			return;
        }
        
        if(i>=10||sum>s) return;
        
		calc(i + 1, sum, N);
		calc(i + 1, sum + i, N + 1);
    }
}
