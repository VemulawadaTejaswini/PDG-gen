import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        long x = 0;
        for(int i = 0;i < n;i++){
          a[i]=sc.nextLong();
          b[i]=sc.nextLong();
        }
        PriorityQueue pq = new PriorityQueue();
        for(int i = 0;i < n;i++){
          for(long j = 0;j < b[i];j++)pq.add(a[i]);
        }
        for(long i = 0;i<k;i++)x = (long)pq.poll();
        System.out.println(x);
    }
}