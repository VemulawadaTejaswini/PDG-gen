import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    int[][] val = new int[N][2];
    for(int i = 0; i < N; i++){
      String[] t = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(t[0]);
      val[i][1] = Integer.parseInt(t[1]);
    }
    Arrays.sort(val, (a, b) -> Integer.compare(a[0], b[0]));
    
    Queue pq = new PriorityQueue(Collections.reverseOrder());
    int ans = 0;
    int A = 0;
    for(int i = 1; i <= M; i++){
      for(int j = A; j < N; j++){
        if(val[j][0] <= i){
          pq.offer(val[j][1]);
        }else{
          A = j;
          break;
        }
      }
      if(!pq.isEmpty()){
      	ans += (int)pq.poll();
      }
    }
    System.out.println(ans);
  }
}