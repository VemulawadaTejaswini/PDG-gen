import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int count = 0;

    for(int i = 0;;i++) {

      if(a > b) {
        System.out.println(0);
        break;
      }

      if(i * a <= b) {
        count = i;
        if(c == i) break;
      }

      if(i * a > b && i < c) {
        count = i - 1;
        break;
      }

    }

    System.out.println(count);


  }

}
