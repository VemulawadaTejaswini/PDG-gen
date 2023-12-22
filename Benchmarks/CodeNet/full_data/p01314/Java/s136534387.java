import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer b = Integer.parseInt(sc.next());

    while (!b.equals(0)) {
      int cnt = 0;

      for(int n = 2; n*(n-1) < 2*b; n++) {
        int bunsi = 2*b -n*(n-1);
        int bunbo = 2*n;
        if(bunsi % bunbo == 0) cnt++;
      }
      System.out.println(cnt);
      b = Integer.parseInt(sc.next());
    }
  }
}

