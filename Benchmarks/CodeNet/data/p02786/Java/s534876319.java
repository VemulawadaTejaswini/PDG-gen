import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int attacks;
    if(h==1)
      System.out.println(0);
    else{
      attacks = Math.log(h)/Math.log(2);
      attacks*=2;
      attacks+=h-1;
    }
    System.out.println(attacks);
  }
}
      
      