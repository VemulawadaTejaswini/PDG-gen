import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long[] array = {a * c, a * d, b * c, b * d};
    long max = array[0];
    for(int i = 1; i < array.length; i++) {
      if (max < array[i]) {
          max = array[i];
      }
    }
    System.out.println(max);
  }
}