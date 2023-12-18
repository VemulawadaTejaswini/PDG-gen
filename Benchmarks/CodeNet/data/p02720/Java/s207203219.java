import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long K = stdIn.nextLong();
        stdIn.close();   
        
        Queue<Long> queue = new ArrayDeque<Long>();
        for (long i = 1; i <= 9; i++) queue.add(i);

        long count = 0;
        long x = 0;
        while (count != K) {
            x = queue.remove();
            if (x % 10 != 0) {
                queue.add((10 * x) + (x % 10) - 1);
            }
            queue.add((10 * x) + (x % 10));
            if (x % 10 != 9) {
                queue.add((10 * x) + (x % 10) + 1);
            }
            count++;
        }
        System.out.println(x);
    }
}