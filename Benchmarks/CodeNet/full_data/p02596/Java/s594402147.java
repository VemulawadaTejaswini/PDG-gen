import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        long num = 0;
        long ans = 0;
        boolean breakFlag = false;
        int valLen = String.valueOf(k).length();
        for (int i = 0; i < valLen; i++) {
            num = num * 10 + 7;
          }
        ans = valLen;
        while (num < Long.MAX_VALUE) {
            if (num % k == 0) {
                breakFlag = true;
                break;
            }
            num = num * 10 + 7;
            ans += 1;
        }
        if (breakFlag) {
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
      }
}