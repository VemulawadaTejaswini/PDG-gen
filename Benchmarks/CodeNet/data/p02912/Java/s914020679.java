import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        int a = 0;
        for ( int i = 0; i < N; i++ ){
            pq.add(sc.nextDouble());
        }
        for ( int j = 0; j < M; j++ ){
            pq.add(pq.poll()/2.0);            
        }
        for ( int i = 0; i < N; i++ ){
            a += pq.poll();        
        }
        System.out.println(a);
    }
}