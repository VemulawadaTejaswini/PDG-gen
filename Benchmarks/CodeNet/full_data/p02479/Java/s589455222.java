import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r, pi = 3.141592653589;
    r = sc.nextDouble();
    System.out.println(Math.pow(r,2)*Math.Pi + " " + 2*Math.Pi*r);
  }
}