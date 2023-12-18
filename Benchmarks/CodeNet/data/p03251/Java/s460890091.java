import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      // 整数の入力
      int n = sc.nextInt();
      // m
      int m = sc.nextInt();
      // x
      int x = sc.nextInt();
      // y
      int y = sc.nextInt();
      boolean flag = true;
      int aMax = -100;
      for (int i=0; i<n; i++) {
        int temp = sc.nextInt();
        if(temp >= y){
          System.out.println("War");
          flag = false;
        }
        if (aMax < temp) {
          aMax = temp;
        }
      }
      int bMin = 100;
      for(int i=0;i<m;i++) {
        int temp = sc.nextInt();
        if(temp <= x) {
          System.out.println("War");
          flag = false;
        }
        if (bMin >= temp) {
          bMin = temp;
        }
      }
      if (aMax >= bMin) {
        System.out.println("War");
        flag = false;
      }
      if (flag) {
        System.out.println("No War");
      }
   }
}