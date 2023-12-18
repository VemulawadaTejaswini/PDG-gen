import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        long k = Long.parseLong(str[1]);

        str = br.readLine().split(" ");
        long base = Long.parseLong(str[0]);
        long max = base;
        for (int i = 1; i < n; i++){
            long next = Long.parseLong(str[i]);
            base = gcd(base, next);
            max = Long.max(max, next);
            if(next == k){
                System.out.println("POSSIBLE");
                System.exit(0);
            }
        }

        if(max < k){
            System.out.println("IMPOSSIBLE");
        } else {
            if(base == 1){
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
