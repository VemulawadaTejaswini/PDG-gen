import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> d=new PriorityQueue<>(11, Collections.reverseOrder());
        for (;;) {
            String n = sc.next();
            if(n.equals("end")){
                break;
            }
            if(n.equals("insert")) {
                d.add(sc.nextInt());
            }else if(n.equals("extract")) {
                System.out.println(d.poll());
            }
        }
    }
}

