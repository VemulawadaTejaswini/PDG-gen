import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if((a % 2) == 1) p++;
    }
    String ans = "first";
    if(p == 0) ans = "second";
  }
}