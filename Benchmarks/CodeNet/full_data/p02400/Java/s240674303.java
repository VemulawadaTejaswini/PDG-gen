import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double r = scanner.nextDouble();
    System.out.printf("%.6f %.6f\n",(r*r*Math.PI),(2*r*Math.PI));
  }
}
