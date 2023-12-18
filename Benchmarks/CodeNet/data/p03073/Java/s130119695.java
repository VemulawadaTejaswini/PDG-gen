import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] data = new String[s.length()+1];

    for (int i = 0; i < s.length(); i++) {
      String k = s.substring(i,i+1);
      data[i] = k;
    }

    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (!data[i].equals(data[i+1])) {
        if (data[i].equals("0")) {
          data[i] = "1";
          count++;
        } else if (!data[i].equals("1")) {
          data[i] = "0";
          count++;
        }
      }
    }

    if (s.length() == 1) {
      count = 0;
    }

    System.out.println(count);

  }

}
