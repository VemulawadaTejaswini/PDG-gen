
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
        long diff = A -B;
        while(h_array.peek() > count * B) {
            long max = h_array.poll();
            long nextMax = h_array.peek();
            if (max - nextMax > diff) {
                long countTemp = (max - nextMax) / diff * diff;
                count += countTemp;
                h_array.add(max - countTemp * diff);
                continue;
            }
            if(max - diff - count * B> SKIP) {
                count += 100;
                h_array.add(max - diff * 100);
            }
            else {
                count++;
                h_array.add(max - diff);
            }
        }
        System.out.println(count);
    }
}
