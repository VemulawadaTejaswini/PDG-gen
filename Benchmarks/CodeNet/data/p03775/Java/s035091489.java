import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long min = Integer.MAX_VALUE;
        
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                long curMin = Math.max(count(i), count(n/i));
                if(curMin < min)
                    min = curMin;
            }
        }
		System.out.println(min);
    }
    
    private static int count(long A) {
        int cntA = 0;
        while(A > 0) {
            cntA++;
            A /= 10;
        }
        return cntA;
    }
    
}
