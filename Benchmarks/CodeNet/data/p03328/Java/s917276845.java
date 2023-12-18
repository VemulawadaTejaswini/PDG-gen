import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = (b-a)*(b-a-1)/2;
    System.out.println(result-a);
  }
}
