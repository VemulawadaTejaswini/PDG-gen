public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(minF(sc.nextInt()));
        }
    }

    public static int minF(int n) {
        int balance = 1;
        int restMulti = 1; 
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            boolean rest = false;  
            while (n % i == 0) {
                n /= i;
                if (rest) balance *= i;
                rest = !rest;
            }
            if (rest) {
                prime.add(i);
                restMulti *= i;
            }
        }
        if (n != 1) {
            prime.add(n);
            restMulti *= n;
        }

        if(prime.isEmpty()) {
            return (int)Math.log10(balance) + 1;
        }

        int minB = Integer.MAX_VALUE;  
        for (int i = 2; i <= (1 << (prime.size() - 1)); i += 2) {
            BitSet set = BitSet.valueOf(new long[]{i});
            int a = 1;
            for (int j = set.nextSetBit(0); j >= 0; j = set.nextSetBit(j + 1)) {
                a *= prime.get(j);
            }
            int b = restMulti / a;
            minB = Math.min(minB, Math.max(a, b));
        }
        return (int)Math.log10(minB) + 1;
    }

}