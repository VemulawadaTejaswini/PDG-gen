import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int m =2, count =0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    while (N != 1) {
      if (N % m == 0) {
        list.add(m);
        N /= m;
        continue;
      }
      m++;
    }
    ArrayList<Integer> listB = new ArrayList<Integer>(new HashSet<>(list));
    int[] listC = new int[listB.size()];
    for (int k =0; k<listB.size(); k++) {
      for (int j =0; j<list.size(); j++) {
        if (listB.get(k) == (list.get(j))) {
          listC[k]++;
        }
      }
    }
    for (int i =0; i<listB.size(); i++) {
      if (listC[i] == 1 || listC[i] == 2) {
        count++;
        continue;
      }
      if (listC[i] >= 3 && listC[i] <=5 ) {
        count += 2;
        continue;
      }
      if (listC[i] >= 6 && listC[i] <=9 ) {
        count += 3;
        continue;
      }
      if (listC[i] >= 10 && listC[i] <=14 ) {
        count += 4;
        continue;
      }
    }
    System.out.println(count);
  }
}