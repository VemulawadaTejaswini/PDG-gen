import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> P = new PriorityQueue<>(Comparator.reverseOrder());
        P.add(sc.nextInt());
        P.add(sc.nextInt());
        P.add(sc.nextInt());
        System.out.println(P.poll()*10 +P.poll() + P.poll());
        sc.close();
    }
}