import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = (long)(sc.nextFloat() * 100);
    sc.close();
    // System.out.printf("a=%d, b=%d, a * b = %d \n", a, b, a * b / 100);
    System.out.printf("%d\n", a * b / 100);
  }
}