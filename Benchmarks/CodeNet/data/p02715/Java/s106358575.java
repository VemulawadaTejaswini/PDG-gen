import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;

        for(int a = 1; a <= k; a++){
            for(int b = 1; b <= k; b++){
                for(int c = 1; c <= k; c++){
                    sum += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(sum % (1000000000 + 7));
    }

    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
