import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();
    double K = Math.ceil(N/2);
    double ans = K/N;
    System.out.println(ans);
  }
}