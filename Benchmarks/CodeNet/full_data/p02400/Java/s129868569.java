import java.util.Scanner;
import java.lang.Math;

class Circle{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    double pi = Math.PI;
    double s = r*r*pi;
    double dis = 2*r*pi;
    System.out.println(s+" "+dis);
  }
}