import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double x = scan.nextDouble();
    System.out.printf("%.7f %.7f\n",Math.PI*x*x,Math.PI*x*2);
  }
}