import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{
            int N = 50022;
            int[] primes = new int[N];
            for (int i=0; i<N; i++) {
                if (i == 0 || i == 1)
                    primes[i] = 0;
                else
                    primes[i] = 1;
            }

            for (int i=2; i<N/2; i++) {
                if (primes[i] == 0) continue;
                for (int j=i*2; j<N; j+=i) {
                    primes[j] = 0;
                } 
            }

            HashMap<Integer, Integer> iidx = new HashMap<Integer, Integer>(); 
            int[] prime_seq = new int[N]; 
            int j = 0;
            for (int i=0; i<N; i++) {
                if (primes[i] == 1) {
                    prime_seq[j] = i;
                    iidx.put(i, j);
                    j++;
                }
            }

            String row = "";
            while ((row = reader.readLine()) != null) {
                int n = Integer.parseInt(row);
                int in = iidx.get(n);
                System.out.println(prime_seq[in-1] + " " + prime_seq[in+1]);
            }
            
        }

}