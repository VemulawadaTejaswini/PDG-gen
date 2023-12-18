import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long A = scan.nextLong();
        long B = scan.nextLong();
        PriorityQueue<Long> h_array = new PriorityQueue<>(N, (x, y) -> Long.compare(y, x));
        for(int i= 0; i < N; i++) {
            h_array.add(Long.parseLong(scan.next()));
        }
        long count = 0;
        long diff = A - B;

        while(h_array.peek() > count * B) {
            long max = h_array.poll();
            long min_case = (max - count * B) / A;
            long c_bombs = min_case / N;
            c_bombs = c_bombs == 0 ? 1 : c_bombs;
            count += c_bombs;
            h_array.add(max - diff * c_bombs);
            final long COUNT = count;
            for (Object temp : h_array.stream().filter(data -> data < COUNT * B).toArray()){
                h_array.remove((Long) temp);
            }
        }
        System.out.println(count);
    }
}