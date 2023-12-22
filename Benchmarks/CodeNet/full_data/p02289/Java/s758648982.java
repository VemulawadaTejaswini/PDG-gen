
import java.util.*;
import java.io.*;

/**
 * C
 */
public class Main {

    void run() {
        
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> PQ = new PriorityQueue<>(1, Collections.reverseOrder());

        String doing;
        int key;

        StringBuilder sb = new StringBuilder();

        while(true) {

            doing = sc.next();

            if(doing.equals("insert")) {
                key = sc.nextInt();
                PQ.add(key);
            } else if(doing.equals("end")) {
                break;
            } else {
                sb.append(Integer.toString(PQ.peek())).append("\n");
                PQ.remove();
            }

        }

        sc.close();

        System.out.print(sb);

    }

    public static void main(String[] args) {
        new Main().run();    
    }

}
