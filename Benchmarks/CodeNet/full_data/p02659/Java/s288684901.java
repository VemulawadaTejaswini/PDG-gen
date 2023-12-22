import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();

    long bInt = (long)(b*100);

    long result = (a * bInt) / 100;
    System.out.println(result);
  }
}