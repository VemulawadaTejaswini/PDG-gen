import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for (int i = 1; ; i++) {
      int w = sc.nextInt();
      if (w == 0) {
        break;
      }
      int n = sc.nextInt();
      int[][] treasure = new int[n][2];
      for (int j = 0; j < n; j++) {
        String str = sc.next();
        String[] strArr = str.split(",");
        treasure[j][0] = Integer.parseInt(strArr[0]);
        treasure[j][1] = Integer.parseInt(strArr[1]);
      }
      int value[][] = new int[n+1][w+1];
      int weight[][] = new int[n+1][w+1];
      for (int j = 1; j < n+1; j++) {
        for (int k = 1; k < w+1; k++) {
          if (k > treasure[j-1][1] && value[j-1][k-treasure[j-1][1]]+treasure[j-1][0] > value[j-1][k]) {
            value[j][k] = value[j-1][k-treasure[j-1][1]]+treasure[j-1][0];
            weight[j][k] = weight[j-1][k-treasure[j-1][1]]+treasure[j-1][1];
          }
          else {
            value[j][k] = value[j-1][k];
            weight[j][k] = weight[j-1][k];
          }
        }
      }
      System.out.println("Case "+i+":");
      System.out.println(value[n][w]);
      System.out.println(weight[n][w]);
    }
  }
}