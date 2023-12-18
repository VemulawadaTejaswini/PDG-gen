import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double minTax = 0.08;
    double maxTax = 0.1;
    int ma =(int) (a/minTax);
    int mb =(int) (b/maxTax);
    sc.close();
    if(Math.abs(ma-mb) >= 0 && Math.abs(ma-mb) < 10 ){
    System.out.println(Math.min(ma,mb));
    }
    else{
      System.out.println("-1");
    }
  }
}