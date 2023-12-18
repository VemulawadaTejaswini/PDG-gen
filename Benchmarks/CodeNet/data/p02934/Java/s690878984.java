import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    double A = 0;
    double B = 1;
    for (int i=0;i<N;i++){
      double n = scan.nextDouble();
      A+=n;
      B*=n;
    }
    System.out.println(B/A);
  }
}