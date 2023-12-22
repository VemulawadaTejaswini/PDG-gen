import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    double S = r*r*Math.PI;
    double L = 2*r*Math.PI;
    System.out.println(S + " " + L);
  } 
}