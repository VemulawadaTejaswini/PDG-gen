import java.util.Scanner;
public class Main{

 public static void main(String[]args){
  final double PI = 3.1415927;
  Scanner stdIn = new Scanner(System.in);
  double r = stdIn.nextDouble();//半径

  System.out.println("円周の長さは" + 2 * PI * r +  "です。");
  System.out.println("面積は" + PI * r * r +  "です。");

   }
 }
