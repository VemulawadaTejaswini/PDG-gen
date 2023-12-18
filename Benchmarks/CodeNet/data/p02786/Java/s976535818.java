import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    double attacks=0;;
    if(h==1)
      System.out.println(0);
    else{
      attacks = (double)(Math.log(h)/Math.log(2));
      attacks=attacks*2;
      attacks=attacks+(h-1);
    }
    System.out.println(attacks);
  }
}
      
      
