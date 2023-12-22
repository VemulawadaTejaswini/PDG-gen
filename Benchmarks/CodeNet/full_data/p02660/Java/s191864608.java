
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    long n = num;
    sc.close();

    List<Long> l = new ArrayList<Long>();

    for (Long i = 2L;i <= num;i++) {
        if (num % i == 0) {
          num /= i;
          l.add(i);
          if (num == 1) {
            break;
          }
          i = 1L;
        }
      }
    Collections.sort(l);

    if(l.size() != 0) {
      List<Long> l2 = new ArrayList<Long>();
      long p = l.get(0);
      int cnt = 0;

      for(int i = 0;i < l.size();i++) {
        if(i != l.size()-1) {
          if(l2.contains(p) && l.get(i) == l.get(i+1)) {
            p *= l.get(i);
          }else if(l2.contains(p) && l.get(i) != l.get(i+1)) {
            p = l.get(i+1);
          }else {
            l2.add(p);
            p = l.get(i+1);
            cnt++;
          }
        }else {
          if(!l2.contains(p)) {
            cnt++;;
          }
        }
      }
      System.out.println(cnt);
    }else {
      System.out.println(0);
    }


  }

}
