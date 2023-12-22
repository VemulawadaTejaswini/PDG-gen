import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      String[] str = sc.nextLine().split("");
      int sum = 0;
      if(str[0].equals("0")) {
        break;
      } else {
        for(int i = 0; i < str.length; i++) {
          int a = Integer.parseInt(str[i]);
          sum += a;
        }
        System.out.println(sum);
      }
    }
  }
}

