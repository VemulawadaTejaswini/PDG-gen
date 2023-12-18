import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();

    for(int i = 0;;i++) {

      int k = i*d*d;

      if(n < k) {
        System.out.println(i);
        break;
      }

    }

  }

}
