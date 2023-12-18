import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long o=0;
       long n=sc.nextLong();
       long k=sc.nextLong();
       PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(long i=0;i<n;i++){
           pq.offer(sc.nextLong());
       }
       if(n<=k){
           o=0;
       }else{
            for(long i=0;i<k;i++){
                pq.poll();
            }
            while(pq.size()>0){
                o+=pq.poll();
            }
       }
      System.out.println(o);
    }
}