import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Double a = sc.nextDouble();
    Double b = sc.nextDouble();
    Double c = sc.nextDouble();
    c = Math.toRadians(c);
    System.out.println(a*b*Math.sin(c));
    System.out.println(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c)));
    System.out.println(b*Math.sin(c));
  }
}