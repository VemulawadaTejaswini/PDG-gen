import java.util.Scanner;
class Main {
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  double x = (a * a) * Math.PI;
  double y = (a * 2) * Math.PI;
  System.out.println(x + " " + y);
 }
}