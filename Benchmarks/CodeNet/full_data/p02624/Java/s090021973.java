import java.util.Arrays;
import java.util.Scanner;
public class Main {

    static int divCount(int n)
    {
        boolean hash[] = new boolean[n + 1];
        Arrays.fill(hash, true);
        for (int p = 2; p * p < n; p++)
            if (hash[p] == true)
                for (int i = p * 2; i < n; i += p)
                    hash[i] = false;

        int total = 1;
        for (int p = 2; p <= n; p++)
        {
            if (hash[p])
            { int count = 0;
                if (n % p == 0)
                {
                    while (n % p == 0)
                    {
                        n = n / p;
                        count++;
                    }
                    total = total * (count + 1);
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i*divCount(i);

        }
        System.out.println(sum);
    }
}