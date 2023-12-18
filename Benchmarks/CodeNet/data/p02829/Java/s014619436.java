

import java.util.HashSet;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hs = new HashSet();
    hs.add(sc.nextInt());
    hs.add(sc.nextInt());
    int ans = 0;
    if(!hs.contains(1)) ans = 1;
    else if(!hs.contains(2)) ans = 2;
    else ans = 3;
    System.out.println(ans);
  }

}
