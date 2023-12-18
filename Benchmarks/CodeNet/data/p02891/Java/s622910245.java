import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        long singleCnt = count(s);
        long doubleCnt = count(s+s);

        long cnt = k / 2 * doubleCnt;
        if(k % 2 == 1)
        	cnt += singleCnt;

        System.out.println(cnt);
    }
    
    private static long count(String s) {
        long cnt = 0;
        for(int i = 1; i < s.length(); i++) {
        	if(s.charAt(i) == s.charAt(i-1)) {
        		cnt++;
        		i++;
        	}
        }
        return cnt;
    }
}
