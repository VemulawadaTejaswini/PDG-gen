
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();
    sc.nextLine();
    String[] str = sc.nextLine().split(" ");

    List<Long> aList = new ArrayList<Long>();
    for(int i = 0;i < n;i++) {
      aList.add(Long.parseLong(str[i]));
    }

    int cnt = 0;
    boolean flg = true;
    for(int i = 0;i < n;i++) {
      for(int j = 0;j < n;j++) {
        if(i != j && aList.get(i) % aList.get(j) == 0) {
          flg = false;
          break;
        }
      }
      if(flg) {
        cnt++;
      }
      flg = true;
    }
    System.out.println(cnt);
  }
}
