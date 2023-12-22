import java.io.IOException;
import java.util.Scanner;

public class Main {
    static boolean isPrime(int q){
        if (q == 2) return true;
        if (q < 2 || ((q & 1) == 0)) return false;
        
        int i = 3;
        while (i * i <= q){
            if (q % i == 0){
                return false;
            }
            i += 2;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            for (int i = 2; i <= n; i++){
                if (isPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}