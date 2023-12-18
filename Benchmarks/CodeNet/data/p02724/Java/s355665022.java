import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = N/500;
    int B = N%500;
    int C = B/5;

    System.out.println(A*1000 + C*5);
}
}