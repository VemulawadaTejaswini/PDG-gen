import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String _s = sc.next();
    char[] t = sc.next().toCharArray();
    _s += _s;
    char[] s = _s.toCharArray();
    int N = s.length;
    int M = t.length;
    for(int i = 0; i < N; i++){
      s[i] -= 'a';
    }
    for(int i = 0; i < M; i++){
      t[i] -= 'a';
    }
    for(int i = 0; i < N; i++){
      que.get(s[i]).add(i);
    }
    int[][] map = new int[N][26];
    for(int[] is : map){
      Arrays.fill(is, Integer.MAX_VALUE / 3);
    }
    for(int i = 0; i < N; i++){
      map[i][s[i]] = 0;
    }
    for(int i = 0; i < 26; i++){
      for(int j = N - 1; j >= 0; j--){
        map[j][i] = Math.min(map[j][i], map[(j + 1) % N][i] + 1);
      }
    }
    
    for(int i = 0; i < 26; i++){
      for(int j = 0; j < N; j++){
        if(map[j][i] == 0){
          map[j][i] = map[(j + 1) % N][i] + 1;
        }
      }
    }
    
    long ans = 0;
    int idx = N/2 - 1;
    if(map[N/2 - 1][t[0]] > Integer.MAX_VALUE / 5){
      System.out.println(-1);
      return;
    }
    ans += map[N/2 - 1][t[0]];
    idx += map[N/2 - 1][t[0]];
    idx %= N/2;
    for(int i = 1; i < M; i++){
      if(map[idx][t[i]] > Integer.MAX_VALUE / 5){
        System.out.println(-1);
        return;
      }
      ans += map[idx][t[i]];
      idx += map[idx][t[i]];
      idx %= N/2;
    }
    System.out.println(ans);
  }
}