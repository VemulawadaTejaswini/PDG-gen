import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    System.out.println(N/(1+(2*D)) + (N%(1+(2*D)) == 0 ? 0 : 1));
  }
}