import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int[][] memo = new int[s.length()+1][t.length()+1];
    System.out.println(solve(memo, s, t));
  }
  
  public static String solve(int[][] memo, String s, String t){
    for(int i = 1; i < memo.length; i++){
      for(int j = 1; j < memo[i].length; j++){
        if(s.charAt(i-1) == t.charAt(j-1)){
          memo[i][j] = memo[i-1][j-1]+1;
        }else{
          memo[i][j] = memo[i-1][j] > memo[i][j-1] ? memo[i-1][j] : memo[i][j-1];
        }
      }
    }
    return repair(memo, s, t);
  }
  
  public static String repair(int[][] memo, String s, String t){
    int i = s.length();
    int j = t.length();
    int n = memo[i][j];
    StringBuilder sb = new StringBuilder();
    while(n != 0){
      if(s.charAt(i-1) == t.charAt(j-1)){
        sb.append(s.charAt(--i));
        j--;
      }else if(memo[i][j-1] > memo[i-1][j]){
        j--;
      }else{
        i--;
      }
      n = memo[i][j];
    }
    return sb.reverse().toString();
  }
}