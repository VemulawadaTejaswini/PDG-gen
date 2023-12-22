import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);
        int K = stdinScanner.nextInt();
        int count = 1;
        int current = 7;
        while (count <= K) {
            if (current % K == 0) {
                System.out.println(count);
                return;
            }
            count++;
            current = (current * 10 + 7) % K;
        }
        System.out.println("-1");
    }