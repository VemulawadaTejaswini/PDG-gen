import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    char[] cs = S.toCharArray();
    int Q = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < Q; i++){
      String[] T = sc.nextLine().split(" ");
      int op = Integer.parseInt(T[0]);
      int[] count = new int[26];
      int ub = -1;
      int lb = -1;
      if(op == 1){
        int m = Integer.parseInt(T[1]);
        cs[m-1] = T[2].charAt(0);
      }else{
        int m1 = Integer.parseInt(T[1])-1;
        int m2 = Integer.parseInt(T[2])-1;
        if(m1 > ub || m2 < lb){
          count = new int[26];
          lb = m1;
          ub = m2;
          for(int j = lb; j <= ub; j++){
            int a = cs[j]-'a';
            count[a]++;
          }
        }else if(m2 >= ub && m1 <= lb){
          for(int j = m1; j < lb; j++){
            int a = cs[j]-'a';
            count[a]++;
          }
          for(int j = ub+1; j <= m2; j++){
            int a = cs[j]-'a';
            count[a]++;
          }
          ub = m2;
          lb = m1;
        }else if(m2 <= ub && m1 >= lb){
          for(int j = lb; j < m1; j++){
            int a = cs[j]-'a';
            count[a]--;
          }
          for(int j = m2+1; j <= ub; j++){
            int a = cs[j]-'a';
            count[a]--;
          }
          ub = m2;
          lb = m1;
        }else if(m1 <= lb && lb <= m2){
          for(int j = m1; j < lb; j++){
            int a = cs[j]-'a';
            count[a]++;
          }
          for(int j = m2+1; j <= ub; j++){
            int a = cs[j]-'a';
            count[a]--;
          }
          ub = m2;
          lb = m1;
        }else{
          for(int j = m1; j < lb; j++){
            int a = cs[j]-'a';
            count[a]--;
          }
          for(int j = m2+1; j <= ub; j++){
            int a = cs[j]-'a';
            count[a]++;
          }
          ub = m2;
          lb = m1;
        }
        int ans = 0;
        for(int j = 0; j < 26; j++){
          if(count[j] != 0){
            ans++;
          }
        }
        System.out.println(ans);
      }
    }
  }
}