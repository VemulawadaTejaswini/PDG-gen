
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        Queue<Long>  queue = new LinkedList<>(List.of(1L,2L,3L,4L,5L,6L,7L,8L,9L));
        int count = 0;
        while (true){
            count++;
            Long x = queue.poll();
            if (count == k){
                out.println(x);
                out.close();
                return;
            }
            if (x % 10 != 0) queue.add(10 * x + (x % 10) -1);
            queue.add(10 * x + (x % 10));
            if (x % 10 != 9) queue.add(10 * x + (x % 10) +1);
        }

    }
}
