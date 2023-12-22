
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  final static Long MAX = 1000000000000000000L;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    List<Long> l = new ArrayList<Long>();
    for(int i = 0;i < n;i++) {
      l.add(sc.nextLong());
    }
    sc.close();

    if(l.contains(0L)) {
      System.out.println(0);
    }else {

      Long sum = 1L;

      for(Long l2:l) {
        if(sum > MAX/l2) {
          System.out.println(-1);
          return;
        }
        sum *= l2;
      }
      System.out.println(sum);
    }


  }

}
