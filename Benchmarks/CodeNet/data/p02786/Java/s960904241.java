import java.util.*;
import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    double attacks = 0;
    double temp =1;
    while(h>0){
      attacks+=temp;
      temp*=2;
      h/=2;
    }
    System.out.println(attacks);
  }
}
      
      
