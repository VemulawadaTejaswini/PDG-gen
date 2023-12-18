import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final String RGB = "RGB";
    int n = sc.nextInt();
    String s = sc.next();
    long answer = 0;
    int[][] chcnt = new int[n][3];

    for (int i = 0; i < n; i++) {
      chcnt[i][RGB.indexOf(s.charAt(i))]++;
      if (i != 0) {
        chcnt[i][0] += chcnt[i - 1][0];
        chcnt[i][1] += chcnt[i - 1][1];
        chcnt[i][2] += chcnt[i - 1][2];
      }
    }
    for(int i = 0; i < n; i++){
      int idx = RGB.indexOf(s.charAt(i));
      int idx1 = (idx + 1) % 3;
      int idx2 = (idx + 2) % 3;
      for(int j = i + 1; j < n; j++){
        int nowIdx = RGB.indexOf(s.charAt(j));
        if(idx1 == nowIdx){
          answer += chcnt[n - 1][idx2] - chcnt[j][idx2];
          if(j + (j - i) < n && RGB.indexOf(s.charAt(j + (j - i))) == idx2){
            answer--;
          }
        }
        if(idx2 == nowIdx){
          answer += chcnt[n - 1][idx1] - chcnt[j][idx1];
          if(j + (j - i) < n && RGB.indexOf(s.charAt(j + (j - i))) == idx1){
            answer--;
          }
        }
      }
    }
    System.out.println(answer);

  }
}