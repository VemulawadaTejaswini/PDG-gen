import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		
        boolean[] primes = new boolean[55555 + 1];
        Arrays.fill(primes, true);
        for(int i = 2; i * i <= 55555; i++) {
            for(int k = 2; k * i <= 55555; k++) {
            	primes[k * i] = false;
            }
        }
        for(int i = 2, n = 0; i <= 55555 && n < N; i++) {
          	if(primes[i] && i % 5 == 1) {
            	n++;
                System.out.print(i + " ");
            }
        }
    }
}