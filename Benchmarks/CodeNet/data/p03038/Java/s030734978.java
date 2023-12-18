import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    PriorityQueue<Long> A = new PriorityQueue<Long>((a,b)->{
        if(a<b)return -1;
        else return 1;
    });
    for(int i=0;i<N;i++){
      A.add(sc.nextLong());
    }
    for(int i=0;i<M;i++){
      int b = sc.nextInt();
      long c = sc.nextLong();
      Long[] stk = new Long[b];
      for(int j=0;j<b;j++){
        Long tp=A.poll();
        if(tp<c) stk[j] = c;
        else {
          stk[j] = tp;
          break;
        }
      }
      for(Long l:stk)
        A.add(l);
    }
    long ans = 0;
    while(!A.isEmpty()){
      ans += A.poll();
    }
    System.out.println(ans);
  }
}
