import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double minTax = 0.08;
    double maxTax = 0.1;
    double ma = a/minTax;
    double mb = b/maxTax;
    if(ma-mb >= 0 && ma-mb < 10){
      System.out.println((int)Math.max(ma,mb));
    }
    else{
      System.out.println(-1);
    }
  }
}