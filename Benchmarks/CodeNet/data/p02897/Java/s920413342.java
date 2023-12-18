import java.util.Scanner;

public class Main { 

    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = gcd(a, b);
        int res = 1;
        if(gcd%2 == 0)
        {
            res++;
            while(gcd%2 == 0)
            {
                gcd/=2;
            }
        }
        for (int i = 3; i*i <=gcd ; i+=2) {
            if(gcd % i == 0)
            {
                res++;
                while(gcd%i == 0)
                    gcd/=i;
            }
        }
        if(gcd > 2)
            res++;
        System.out.println(res);
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }


}
