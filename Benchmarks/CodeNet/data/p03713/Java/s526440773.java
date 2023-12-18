import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();

      long minDiff = calculateArea(h, w, Long.MAX_VALUE);
      
      minDiff = calculateArea(w, h, minDiff);
      System.out.println(minDiff);
  }

  private static long calculateArea(long h, long w, long minDiff) {
      long area1 = 0, area2 = 0, area3 = 0;
      for(int i = 1; i <= (h+1)/2; i++) {
          area1 = i * w;
          area2 = (h - i) * (w / 2);
          area3 = (h - i) * (w - w / 2);
          long diff = Math.max(area1, Math.max(area2, area3)) - Math.min(area1, Math.min(area2, area3));
          minDiff = Math.min(minDiff, diff);
      }
      return minDiff;
  }
}
