import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = {111,222,333,444,555,666,777,888,999};

    for (int i = 0;i < 9;i++) {
      if (data[i] >= n) {
        System.out.println(data[i]);
        break;
      }
    }
  }

}
