import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    float r = scan.nextFloat();
    float S = r*r*Math.PI;
    float L = 2*r*Math.PI;
    System.out.println(S + " " + L);
  } 
}