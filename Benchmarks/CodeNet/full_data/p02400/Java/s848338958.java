import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r = Float.parseFloat(sc.next());
    double area = Math.PI*r*r;
    double length = Math.PI*2*r;
    System.out.printf("%f %f\n", area, length);
  }
}
