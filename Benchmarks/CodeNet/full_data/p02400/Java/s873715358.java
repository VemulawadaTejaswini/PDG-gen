import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Circle{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    double pi = Math.PI;
    double s = r*r*pi;
    double dis = 2*r*pi;
    System.out.printf("%1.6f %1.6f",s,dis);
    return;
  }
}