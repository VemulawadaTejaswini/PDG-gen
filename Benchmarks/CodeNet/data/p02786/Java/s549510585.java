import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    double attacks = 0;
    while(h>0){
    attacks+ = 2*(h/2) + 1;
      h = h/2;
    }
    attacks = attacks-1;
    System.out.println(attacks);
  }
}
      
      
