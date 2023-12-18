import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    Integer[] a = new Integer[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    sc.close();

    // color[0]:灰 [1]:茶 [2]:緑 [3]:水 [4]:青 [5]:黄 [6]:オレンジ [7]:赤 [8]:自由      
    int[] color = new int[9];

    for (int i = 0; i < N; i++) {
      if (a[i] < 400) {
        color[0]++;
      } else if (a[i] < 800) {
        color[1]++;
      } else if (a[i] < 1200) {
        color[2]++;
      } else if (a[i] < 1600) {
        color[3]++;
      } else if (a[i] < 2000) {
        color[4]++;
      } else if (a[i] < 2400) {
        color[5]++;
      } else if (a[i] < 2800) {
        color[6]++;
      } else if (a[i] < 3200) {
        color[7]++;
      } else {
        color[8]++;
      }
    }

    int min = 0;
    int max = 0;

    for (int i = 0; i < 8; i++) {
      if (color[i] != 0) {
        min++;
      }
    }
    
    if (8 - min < color[8]){
      max = 8;
    } else {
      max = min + color[8];
    }

    if (min == 0){
      min = 1;
    }

    System.out.println(min + " " + max);

  }

}