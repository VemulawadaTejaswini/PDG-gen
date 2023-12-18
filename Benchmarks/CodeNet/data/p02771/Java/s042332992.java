import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    boolean P = false;
    if (A==B && B!=C){ P = true; }
    if (A==C && B!=C){ P = true; }
    if (B==C && B!=A){ P = true; }
    if (P) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}