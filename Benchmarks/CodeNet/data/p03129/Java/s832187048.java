import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    System.out.println(String.format("%s", ((N+(N%2))/2>=K) ? "YES" : "NO"));
  }
}
