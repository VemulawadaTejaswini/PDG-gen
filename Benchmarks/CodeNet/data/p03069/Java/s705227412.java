import java.util.Scanner;

public class Main {
  static char[] colors = {'.', '#'};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    Main tenkaC = new Main();
    System.out.println(tenkaC.solve(n, s));
  }

  public int solve(int n, String s) {
    int whiteNum = 0;
    int blackNum = 0;
    int[] whiteNums = new int[n];
    int[] blackNums = new int[n];
    for(int i = 0; i< n; i++ ){
      if(s.charAt(i) == '.' ){
        whiteNum += 1;
      } else {
        blackNum += 1;
      }
      whiteNums[i] = whiteNum;
      blackNums[i] = blackNum;
    }
    int ans = whiteNum;
    for(int i = 0; i < n; i++ ){
      ans = Math.min(ans, blackNums[i] + whiteNum - whiteNums[i]);
    }
    return ans;
  }
}
