import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    int n = 0;
    if(N == 1){
      n = 10;
    }else if(N == 2){
      n = 100;
    }else{
      n = 1000;
    }
    
    char[][] val = new char[M][2];
    for(int i = 0; i < M; i++){
      S = sc.nextLine().split(" ");
      val[i][0] = S[0].charAt(0);
      val[i][1] = S[1].charAt(0);
    }
    int st = n/10;
    if(st == 1) st = 0;
    for(int i = st; i < n; i++){
      String s = i+"";
      boolean f = true;
      for(int j = 0; j < M; j++){
        int m = val[j][0]- '0' - 1;
        if(m >= s.length()) continue;
        char c = s.charAt(m);
        if(c != val[j][1]){
          f = false;
          break;
        }
      }
      if(f){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}