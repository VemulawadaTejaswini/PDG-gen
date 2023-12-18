import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int n = Arrays.stream(N.split("")).mapToInt(Integer::parseInt).sum();
    System.out.println(Integer.parseInt(N)%n == 0 ? "Yes" : "No");
  }
}