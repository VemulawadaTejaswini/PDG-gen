import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;

    while(tmp){
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      String ans = "";

      if(m == -1 && f == -1 && r == -1){
        tmp = false;
        break;
      }

      if(m == -1 || f == -1){
        ans = "F";
      } else if(m + f >= 80){
        ans = "A";
      } else if(m + f >= 65){
        ans = "B";
      } else if(m + f >= 50){
        ans = "C";
      } else if(m + f >= 30 && r >= 50){
        ans = "C";
      } else if(m + f >= 30 && r < 50){
        ans = "D";
      } else {
        ans = "F";
      }

      System.out.println(ans);
    }
  }
}

