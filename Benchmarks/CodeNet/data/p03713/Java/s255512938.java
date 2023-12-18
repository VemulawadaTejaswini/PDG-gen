import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    int S = h * w;
    int Smax, Smin;
    int[] gap = new int[2];
    int minigap = 0, g = 0;
    int a, b, s1, s2, s3;

    if(S % 3 == 0) {
      minigap = 0;
    } else {
      for(a = 1; a < w; a++) {
        for(b = 1; b < h; b++) {
          s1 = h * a;
          s2 = b * (w - a);
          s3 = (h - b) * (w - a);
          if(s1 > s2) {
            if(s1 < s3) {
              Smax = s3;
              Smin = s2;
              gap[g] = s3 - s2;
            } else {
              Smax = s1;
              if(s2 > s3) {
                Smin = s3;
                gap[g] = s1 - s3;
              } else {
                Smin = s2;
                gap[g] = s1 - s2;
              }
            }
          } else {
            if(s2 < s3) {
              Smax = s3;
              Smin = s1;
              gap[g] = s3 - s1;
            } else {
              Smax = s2;
              if(s1 > s3) {
                Smin = s3;
                gap[g] = s2 - s3;
              } else {
                Smin = s1;
                gap[g] = s2 - s1;
              }
            }
          }
          if(a == 1 && b == 1) {
            minigap = gap[g];
            g++;
          } else {
            if(minigap > gap[g]) {
              minigap = gap[g];
              g = 0;
            } else {
              minigap = minigap;
              g = 0;
            }
          }
        }
      }
    }

    System.out.println(minigap);
    
  }
}
