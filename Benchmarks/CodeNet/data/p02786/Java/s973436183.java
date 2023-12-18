import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    double attacks = 0;
    while(h){
    attacks = 2*h + 1;
      h = h/2;}
    System.out.println(attacks);
  }
}
      
      
