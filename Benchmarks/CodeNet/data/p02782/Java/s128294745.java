import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int r1 = stdIn.nextInt();
        int c1 = stdIn.nextInt();
        int r2 = stdIn.nextInt();
        int c2 = stdIn.nextInt();
        long kaijo[] = new long[r2 + c2 + 1];
        
        long sum = 1;
        
        for(int i = 1; i <= r2 + c2; i++){
            sum = (sum % 1000000007) * (i % 1000000007);
            kaijo[i] = sum;
        }
        
        long num = 0;
        
        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                num += (num % 1000000007) + (kaijo[i + j] % 1000000007) / ((kaijo[i] % 1000000007) * (kaijo[j] % 1000000007));
            }
        }

        System.out.println(num);
        
        
    }
}
