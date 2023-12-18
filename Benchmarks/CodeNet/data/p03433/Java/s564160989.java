import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    String ans = (n-a)%500==0? "Yes":"No";
    System.out.println(ans);
  }
}

