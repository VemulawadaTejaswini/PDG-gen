import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      StringBuilder sb = new StringBuilder();
      while(n != 0) {
        if(n % -2 == 0) 
            sb.append("0");
        else {
            sb.append("1");
            n--;
        }
        n /= -2;
      }
      System.out.println(sb.reverse().toString());
  }
}