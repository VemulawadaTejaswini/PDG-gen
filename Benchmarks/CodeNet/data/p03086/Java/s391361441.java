import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String S[] = s.split("");
    int[] c = new int[s.length()];
    for(int i = 0;i < s.length();i++){
      c[i] = 0;
    }
    int count = 0;
    String A = "A";
    String C = "C";
    String G = "G";
    String T = "T";
    for(int i = 0;i < s.length();i++){
      if(S[i].equals(A) || S[i].equals(C) || S[i].equals(G) || S[i].equals(T)){
        count++;
      }
      else{
        c[i] = count;
        count = 0;
      }
    }
    int ans = c[0];
    for(int i = 0;i < s.length();i++){
      if(ans < c[i]){
        ans = c[i];
      }
    }
    System.out.println(ans);
  }
}
