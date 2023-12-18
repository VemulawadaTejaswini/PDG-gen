import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long l = 1;
        long i = (n / 2) - 1;
        //ここから下消すかも
        boolean sosuu = true;
        for (int a = 3; a < Math.sqrt(n); a += 2) {
            if (n % a == 0)
                sosuu=false;
        }
        if (!sosuu) {
            for (; i < (n + 1); i += 2) {
                if (n % i == 0) {
                    l = i;
                    break;
                }
            }
        }
        else if(sosuu){
            l=1;
        }
        System.out.println(l + (n / l) - 2);
    }
}