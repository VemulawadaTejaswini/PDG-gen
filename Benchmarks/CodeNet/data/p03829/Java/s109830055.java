import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    long A = Long.parseLong(S[1]);
    long B = Long.parseLong(S[2]);
    
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
    }
    
    long[] dis = new long[N-1];
    for(int i = 0; i < N-1; i++){
      dis[i] = (num[i+1] - num[i]) * A;
      if(dis[i] > B){
        dis[i] = B;
      }
    }
    
    long ans = 0;
    for(int i = 0; i < N-1; i++){
      ans += dis[i];
    }
    System.out.println(ans);
  }
}