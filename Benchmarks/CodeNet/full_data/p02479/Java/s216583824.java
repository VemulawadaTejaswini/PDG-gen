import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    double pi = Math.PI;
    Scanner sca = new Scanner(System.in);
    double r = sca.nextDouble();

    System.out.println(r*r*pi + 2*pi*r);

  }
}