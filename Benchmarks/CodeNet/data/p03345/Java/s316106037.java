import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    long a = stdIn.nextLong(), b = stdIn.nextLong(), c = stdIn.nextLong();
    long k = stdIn.nextLong();

    for(int i = 0; i < k; i++) {
      long tmp1 = a;
      a = b + c;
      long tmp2 = b;
      b = tmp1 + c;
      c = tmp1 + tmp2;
    }

    if(Math.abs(a - b) > (long) Math.pow(10, 18)) {
      System.out.println("Unfair");
    }
    else
      System.out.println(a - b);
  }
}
