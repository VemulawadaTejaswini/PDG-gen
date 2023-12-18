import java.util.Scanner;

public class AtCoderTest {
    static boolean is_prime(int n)
    {

        if (n <= 1) return false;
        if (n <= 3) return true;


        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
    static int nextPrime(int N)
    {
        if (N <= 1 || N == 2)
            return 2;

        int prime = N;
        boolean found = false;

        while (!found)
        {
            prime++;

            if (is_prime(prime))
                found = true;
        }

        return prime;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (is_prime(N)){
            System.out.println(N);
        }
        else{
                System.out.println(nextPrime(N));
        }
    }
}


