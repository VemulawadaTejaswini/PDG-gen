import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = 0;
    int[] color = new int[8];
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (a >= 3200) {
        x++;
      } else {
        color[a/400]++;
      }
    }

    int noone = 0;
    for (int i = 0; i < 8; i++) {
      if (color[i] == 0) {
        noone++;
      }
    }
    
    int min = Math.max(8 - noone, 1);
    int max = 8-noone+x;
    
    System.out.println(min + " " + max);
  }
}