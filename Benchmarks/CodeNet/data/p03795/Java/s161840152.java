import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long P = 1;
    for ( int i = 1; i <= n ; i++) {
       P = P * i;
       P = P % 1000000007; 
   }
    System.out.println(P);
  }
}