import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        long ans = 0;
        long ai = sc.nextLong();
        for (int i = 1; i < N; i++) {
        	long a = sc.nextLong();
        	long total = ai + a;
        	if (ai > 0) {
        		if (total < 0) {
        			ai = total;
        			continue;
        		} else {
        			long tmp = total + 1;
        			ans += Math.abs(tmp);
        			ai = -1;
        		}
        	} else if(ai < 0) {
        		if (total > 0) {
        			ai = total;
        			continue;
        		} else {
        			long tmp = total - 1;
        			ans += Math.abs(tmp);
        			ai = 1;
        		}
        	}
        }
        
        System.out.println(ans);
    }
}