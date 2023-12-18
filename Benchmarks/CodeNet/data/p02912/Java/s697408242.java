import java.util.Scanner;
import java.lang.*;
import java.io.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int cupon=scan.nextInt();
    long[] price=new long[num];
    long Ans=0;
    int plus=0;
    for(int a=0; a<num; a++){
      price[a]=scan.nextInt();
    }
    double max=price[0];
    for(int a=cupon;a>0;a--){
      for(int b=1; b<num; b++){
        if(max<price[b]){
          plus=b;
          max=price[b];
        }
      }
      max=Math.floor(max/2);
      price[plus]=(long)max;
    }
    for(int a=0;a<num;a++){
      Ans+=price[a];
    }
    System.out.println(Ans);
  }
}