import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[][] red = new int[N][2];
    for (int i = 0; i < N; i++) {
      red[i][0] = sc.nextInt();
      red[i][1] = sc.nextInt();
    }
    Arrays.sort(red, (a, b)->b[1]-a[1]);

    int[][] blue = new int[N][2];
    for (int i = 0; i < N; i++) {
      blue[i][0] = sc.nextInt();
      blue[i][1] = sc.nextInt();
    }
    Arrays.sort(blue, (a, b)->a[0]-b[0]);

    int ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (red[j][0] != -1&& red[j][1] != 1
            && red[j][0] < blue[i][0]
            && red[j][1] < blue[i][1]) {
          ans++;
          red[j][0] = -1;
          red[j][1] = -1;
        }
      }
    }
    
    System.out.println(ans);
  }
}