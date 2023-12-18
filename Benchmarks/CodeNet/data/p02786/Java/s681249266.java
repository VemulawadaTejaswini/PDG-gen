import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int attacks=0;;
    if(h==1)
      System.out.println(0);
    else{
      attacks = (int)(Math.log(h)/Math.log(2));
      attacks*=2;
      attacks+=h-1;
    }
    System.out.println(attacks);
  }
}
      
      
