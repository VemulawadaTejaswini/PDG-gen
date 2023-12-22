import java.util.Scanner;

class Main{
  public static void main(String[] args){
    float r ;
    Scanner sc = new Scanner(System.in);
    r = sc.nextFloat();
    double s = r*r*Math.PI;
    double a = 2*r*Math.PI;
    System.out.printf("%f %f", s,a);
  }
}