import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int sq = (int)Math.sqrt(N);
        long result = 0;
        for(int i = sq; i > 0; i--){
            if(N % i == 0){
                result = N / i + i - 2;
                break;
            }
        }
        System.out.println(result);
    }
}
