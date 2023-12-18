import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int d = sc.nextInt();
    for(int i = 0; i < h; i++) {
      String s = "";
      for(int j = 0; j < w; j++) {
        int d0 = Math.abs(i + j) % (2 * d);
        int d1 = Math.abs(i - j) % (2 * d);
        if((d0 < d) && (d1 < d)) {
          s += "R";
        } 
        if((d0 < d) && (d1 >= d)) {
          s += "Y";
        } 
        if((d0 >= d) && (d1 < d)) {
          s += "G";
        } 
        if((d0 >= d) && (d1 >= d)) {
          s += "B";
        } 
      }
      System.out.println(s);
    }
  }
}