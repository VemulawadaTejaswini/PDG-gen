import java.util.*;
public class Main { 
    public static void main(String[] args) {
      	long o=0;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int[] a=new int[n];
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<n;i++){
       	 	a[i]=sc.nextInt();        
       }
      for(int i=0;i<n;i++){
      	for(int j=0;j<n;j++){
      	  pq.offer(a[i]+a[j]);         
      	}
      }
      for(int i=0;i<m;i++){
      	o+=pq.poll();
      }
     
      System.out.println(o);
    }
}