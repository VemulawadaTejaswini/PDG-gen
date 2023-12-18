import java.util.*;
class Main
{
    static long[] p = new long[51], b = new long[51];
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        p[0] = 1;
        b[0] = 1;
        for(int i = 1; i <= 50; i++){
            p[i] = p[i-1] * 2 + 3;
            b[i] = b[i-1] * 2 + 1;
        }
        System.out.println(func(n, x));
    }
    static long func(int n, long x){
        if(n == 0){
            if(x <= 0) return 0;
            else return 1;
        }
        else{
            if(x <= 1) return 0;
            else if(1 < x && x < 2 + p[n-1]) return func(n-1, x-1);
            else if(x == 2 + p[n-1]) return b[n-1] + 1;
            else if(2 + p[n-1] < x && x < 2 * p[n-1] + 3) return b[n-1] + 1 + func(n-1, x - p[n-1] - 2);
            else return 2 * b[n-1] + 1;
        }
    }
}