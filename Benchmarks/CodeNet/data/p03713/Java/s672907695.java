import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long  H = sc.nextLong();
    long W = sc.nextLong();
    long S = (long)H * W;
    //縦に切ってから横
    long S1a = H * W - H * (W/3) - div2(H,W - W/3) - H * (W/3);
    long S1b = H * (W/3 + 1) - div2(H,W - (W/3 + 1)); 
    long S1 = Math.min(S1a, S1b); 
    //横に切ってから縦
    long S2a = H * W - (H/3) * W - div2(W,H - H/3) - (H/3) * W;
    long S2b = (H/3 + 1) * W - div2(W,H - (H/3 + 1));
    long S2 = Math.min(S2a, S2b);
    
    if (S % 3 ==0) {
      System.out.println(0);
    } else {
      System.out.println(Math.min(S1,S2));
    }
  }
  
  static long div2(long a, long b) {
    if (a * b % 2 == 0) {
      return  (long)(a * b)/2;
    }else {
      long c1 = (long)(a/2) * b;
      long c2 = (long)(b/2) * a;
      return Math.max(c1,c2);
    }
  }
}