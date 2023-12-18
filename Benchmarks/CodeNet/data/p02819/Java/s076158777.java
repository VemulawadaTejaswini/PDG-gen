import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = Integer.parseInt(sc.next());
        int primeNum;
        while (true) {
            if (isPrimeNumber(x)) {
                primeNum = x;
                break;
            }
            x++;
        }
        out.println(primeNum);
        
        out.flush();
    }
  
    static boolean isPrimeNumber(int target) {
        int sqrt = (int)Math.sqrt(target);
        boolean result = true;
        for (int i = 2; i <= sqrt; i++) {
            if (target % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
  
}