import java.util.Scanner;

public class Main{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double r=sc.nextDouble();
    double s=Math.PI*r*r;
    double l=2*Math.PI*r;
    System.out.printf("%.6f",s);
    System.out.print(" ");
    System.out.printf("%.6f\n",l);
  }
}

