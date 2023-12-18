//座標(H-W-1,B+1)を点Pとする

import java.util.*;

public class Main {
  static int H,W,A,B;
  static int Smaller = 1;
  static int modtotal,total,p,pxtotal,p1,p2,p3,p4;
  static int px,p1x,p2x,p3x,p4x;
  static int pxa,p1xa,p2xa,p3xa,p4xa;
  static int p1sum = 1;
  static int p2sum = 1;
  static int p3sum = 1;
  static int p4sum = 1;
  static int p1xasum = 1;
  static int p2xasum = 1;
  static int p1xbsum = 1;
  static int p2xbsum = 1;
  static int p3xsum = 1;
  static int p4xsum = 1;
  static int p1p2,p3p4,p1p2x,p1p2xa,p1p2xb,p3p4x;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();
    for (int i=0; i<H; i++) {
      int p1 = (H-A+B-i);
        p1sum *= p1;
      int p2 = (B+1-i);
        p2sum *= p2;
    }
    for (int i=0; i<A+1; i++) {
      int p3 = (A+W-B-i);
        p3sum *= p3;
      int p4 = (A+1-i);
        p4sum *= p4;
    }
    p1p2 = p1sum / p2sum;
    p3p4 = p3sum / p4sum;
    p = p1p2 * p3p4; //点Pにおける組み合わせ
    
    for (int i=1; i<W-B; i++) {
      for (int j=0; j<H; j++) {
        int p1xa = (H-A+B+i-j);
        p1xasum *= p1xa;
        int p2xa = (B+1+i-j);
        p2xasum *= p2xa;
        int p1xb = (H-A+B+i-j-1);
        p1xbsum *= p1xb;
        int p2xb = (B+i-j);
        p2xbsum *= p2xb;
        int p3x = (A+W-B+i-j);
        p3xsum *= p3x;
        int p4x = (A+1+i-j);
        p4xsum *= p4x;
        }
      p1p2xa = p1xasum / p2xasum;
      p1p2xb = p1xbsum / p2xbsum;
      p1p2x = p1p2xa - p1p2xb;
      p3p4x = p3xsum / p4xsum;
      pxtotal += p1p2x * p3p4x;
    }
    total = p + pxtotal;
    modtotal = total % 1000000007;
    System.out.println(modtotal);
    
  }
}