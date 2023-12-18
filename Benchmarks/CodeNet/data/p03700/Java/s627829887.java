import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long SKIP = (long) 1e5;
        int N = scan.nextInt();
        long A = scan.nextLong();
        long B = scan.nextLong();
        PriorityQueue<Long> h_array = new PriorityQueue<>(N, (x, y) -> Long.compare(y, x));
        for(int i= 0; i < N; i++) {
            h_array.add(scan.nextLong());
        }
        long count = 0;
        while(h_array.peek() > count * B) {
            count++;
            long max = h_array.poll();
            if(max - A + B > SKIP) {
                count += 99;
                h_array.add(max - (A - B) * 100);
            }
            else {
                h_array.add(max - A + B);
            }
        }
        System.out.println(count);
    }
}
