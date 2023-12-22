import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();

    b *= 100;
    long ans = a*(long)b;
    ans /= 100;

    System.out.println(ans);



  }

}
