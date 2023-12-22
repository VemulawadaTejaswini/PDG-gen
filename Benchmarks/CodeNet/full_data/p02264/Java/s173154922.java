import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        Deque<Integer> quu = new LinkedList<>();
        Deque<String> name = new LinkedList<>();
        int hour = 0;
        
        int qa = sca.nextInt();
        int K = 0;
        while (K < n) {
            name.add(sca.next());
            quu.add(sca.nextInt());
             ++K;
        }
        while (quu.size() > 0) {
            
            quu.addLast(quu.poll() - qa);
            name.addLast(name.poll());
            hour += qa;
            
            if (quu.peekLast() <= 0) {
                hour += quu.pollLast();;
                System.out.println(name.pollLast() + " " + hour);
            }
        }
    }
}
