import java.util.Scanner;

class Main{
  public static void main(String[] args){
    double r;
    Scanner sc = new Scanner(System.in);
    r = sc.nextDouble();
    double s = r*r*Math.PI;
    double a = 2*r*Math.PI;
    System.out.printf("%f %f", s,a);
  }
}