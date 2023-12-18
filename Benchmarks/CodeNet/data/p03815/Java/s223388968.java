import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
//        int[] dice = {1,2,3,4,5,6};
        long ans = 1;
        x -= 6;
        int a = 6;
        while (true){
            if (x<=0) break;
            if (a == 6){
                a = 5;
                x -= a;
            }else if (a == 5){
                a = 6;
                x -= a;
            }
            ans++;
        }
        System.out.println(ans);
        
    }
    
}
