import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long T1 = sc.nextLong();
    long T2 = sc.nextLong();
    long A1 = sc.nextLong();
    long A2 = sc.nextLong();
    long B1 = sc.nextLong();
    long B2 = sc.nextLong();


    long s11 = A1*T1;
    long s12 = A2*T2;
    long s21 = B1*T1;
    long s22 = B2*T2;
    long s1 = s11+s12;
    long s2 = s21+s22;

    if ((s11-s21)*(s21-s22) > 0) {
      System.out.println(0);
      return;
    }

    if ((s11-s21)*(s12-s22) < 0) {
      if (s1==s2) {
        System.out.println("infinity");
        return;
      }

      if ((s11 < s21 && s1 < s2) || (s11 > s21 && s1 > s2)) {
        System.out.println(0);
        return;
      }

      if (s11 < s21 && s1 > s2) {
        System.out.println((s21-s11)/(s1-s2));
        return;
      }

      if (s11 > s21 && s1 < s2) {
        System.out.println((s11-s21)/(s2-s1));
        return;
      }
    }

  }
}
