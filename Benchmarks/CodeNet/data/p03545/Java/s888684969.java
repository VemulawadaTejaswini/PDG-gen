import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int[] data = new int[4];

    for (int i = 0; i < data.length; i++) {
      data[i] = Integer.valueOf(s.substring(i,i+1));
    }

    String[] op = new String[3];

    int ans = 0;

    for (int i = 0; i < Math.pow(2,data.length-1); i++) {
      ans = data[0];
      for (int j = 0; j < op.length; j++) {
        if ((1&i >> j) == 1) {
          ans += data[j+1];
          op[j] = "+";
        } else {
          ans -= data[j+1];
          op[j] = "-";
        }
      }
      if (ans == 7) break;
    }

    System.out.println(data[0]+op[0]+data[1]+op[1]+data[2]+op[2]+data[3]+"="+ans);

  }

}
