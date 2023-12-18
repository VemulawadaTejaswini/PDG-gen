import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int digit;
    int times;
    long temp = 0;
    long long sum = 0;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++) {
      digit = Integer.parseInt(sc.next());
      times = Integer.parseInt(sc.next());
      temp += times;
      sum += digit * times;
    }
    System.out.println(temp + sum / 10 - 1);
  }
}
