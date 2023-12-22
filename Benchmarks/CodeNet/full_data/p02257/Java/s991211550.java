import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        boolean[] primes = new boolean[10001];
        Arrays.fill(primes, true);
        for (int i = 2; i <= 10000; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < 10000; j += i) {
                    primes[j] = false;
                }
            }
        }
        boolean[] in = new boolean[10001];
        Arrays.fill(in, false);
        while (input.hasNext()) {
            in[input.nextInt()] = true;
        }
        int count = 0;
        for (int i = 0; i <= 10000; i++) {
            if (in[i] && primes[i]) count++;
        }
        System.out.println(count);
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
}