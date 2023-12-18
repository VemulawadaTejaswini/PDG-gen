import java.util.*;

class Main
{
    static int MOD = 998244353;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        
        long kmax = 0;
        if(a != b){
            while(Math.pow(2, kmax) + Math.pow(-1, kmax) * Math.abs(a-b) <= 3 * Math.pow(10, 18)){
                kmax++;
            }
        }else{
            kmax = Long.MAX_VALUE;
        }
        long A;
        if(k > kmax) System.out.println("Unfair");
        if(k == 0){
            A = a - b;
            System.out.println(A);
        }   
        else{
            A = (long)(Math.pow(2, k) + Math.pow(-1, k)) / 3 * (a - b);
            System.out.println(A);
        }
    }
}