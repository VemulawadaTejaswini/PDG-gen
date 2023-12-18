

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<long[]> al = new ArrayList();
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      long x = sc.nextLong();
      long l = sc.nextLong();
      long[] tmp = {x-l,x+l};
      al.add(tmp);
    }
    Collections.sort(al, new Comparator<long[]>() {
      public int compare(long[] a1, long[] a2) {
        return Long.compare(a1[1],a2[1]);
      }
    });
    int ans = 1;
    long r1 = al.get(0)[1];
    for(int i = 1; i < n; i++) {
      long l1 = al.get(i)[0];
      long r2 = al.get(i)[1];
      if(l1>=r1) {
        ans++;
        r1=r2;
      }
    }
    System.out.println(ans);
  }

}
