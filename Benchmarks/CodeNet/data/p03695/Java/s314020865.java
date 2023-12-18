import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] color = new int[8];
    int min =0, max =0, expert =0;
    for (int i =0; i<N; i++) {
      int x = sc.nextInt();
      if (x >= 3200) {
        expert++;
      } else if (x >= 2800 && x <3200) {
        color[7]++;
      } else if (x >= 2400 && x <2800) {
        color[6]++;
      } else if (x >= 2000 && x <2400) {
        color[5]++;
      } else if (x >= 1600 && x <2000) {
        color[4]++;
      } else if (x >= 1200 && x <1600) {
        color[3]++;
      } else if (x >= 800 && x <1200) {
        color[2]++;
      } else if (x >= 400 && x <800) {
        color[1]++;
      } else if (x >= 1 && x <400) {
        color[0]++;
      }
    }
    for (int i =0; i<8; i++) {
      if (color[i] != 0) min++;
    }
    max = Math.min(min + expert, 8);
    min = Math.max(min, 1);
    System.out.println(min + " " + max);
  }
}