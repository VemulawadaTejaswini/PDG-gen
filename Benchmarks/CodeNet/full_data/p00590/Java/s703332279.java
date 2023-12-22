import java.util.*;

class Main {
    public static HashSet<Integer> hs = new HashSet<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int count = 0;
            int n = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = i+1;
                b[i] = n-i;
            }
            sieveOfEratosthenes(n);
            for(int i = 0; i < n; i++)
                if(hs.contains(a[i]) && hs.contains(b[i]))
                    count++;
            System.out.println(count);
        }
    }
    static void sieveOfEratosthenes(int n) {
        long prime[] = new long[n + 1];

        for (int p = 2; p * p <= n; p++)
            if (prime[p] == 0)
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = 1;

        for (int i = 2; i <= n; i++)
            if (prime[i] == 0)
                hs.add(i);
    }
}