import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      long sum = 0;
      for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
          for(int k = j + 1; k < n; k++) {
            if(j - i == k - j || s.charAt(i) == s.charAt(j) || s.charAt(i) == s.charAt(k) || s.charAt(j) == s.charAt(k))
              continue;
            sum++;
          }
        }
      }
      System.out.println(sum);
  }
}