import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
      	int now = 1;
      	int next = 0;
         Integer h[] = new Integer[n];
          for (int i=0; i<n; i++) {
              h[i] = sc.nextInt();
          }
      
      for(long i=0; i<k; i++){
        next = h[now-1];
        now = next;
      }
      
      System.out.println(now);
    }
}