import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    long S = (long)H * W;
    //縦に切ってから横
    long S1a = H * W - H * (W/3) - div2(H,W - W/3) - H * (W/3);
    long S1b = H * (W/3 + 1) - div2(H,W - (W/3 + 1)); 
    long S1 = Math.min(S1a, S1b); 
    //横に切ってから縦
    long S2a = H * W - (H/3) * W - div2(W,H - H/3) - (H/3) * W;
    long S2b = (H/3 + 1) * W - div2(W,H - (H/3 + 1));
    long S2 = Math.min(S2a, S2b);
    //全部縦か横
    long S3 = Math.min(H,W);
      
    if (S % 3 ==0) {
      System.out.println(0);
    } else {
      System.out.println(Math.min(Math.min(S1,S2),Math.min(S2,S3)));
    }
  }
  
  static long div2(int a, int b) {
    if (a * b % 2 == 0) {
      return  (long)(a * b)/2;
    }else {
      long c1 = (long)(a/2) * b;
      long c2 = (long)(b/2) * a;
      return Math.max(c1,c2);
    }
  }
}