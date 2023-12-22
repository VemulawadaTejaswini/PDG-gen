import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    sc.close();

    long n2 = n % 1000;
    if (n2 == 0) {
      System.out.println(0);
    } else {
      System.out.println(1000 - n2);
    }


  }
}
