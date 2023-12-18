import java.util.Scanner;
import java.lang.*;
import java.io.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int cupon=scan.nextInt();
    int[] price=new int[num];
    int Ans=0;
    double max;
    int plus=0;
    for(int a=0; a<num; a++){
      price[a]=scan.nextInt();
    }
    for(int a=cupon;a>0;a--){
      max=price[0];
      for(int b=1; b<num; b++){
        if(max<price[b]){
          plus=b;
          max=price[b];
        }
      }
      max=Math.floor(max/2);
      price[plus]=(int)max;
    }
    for(int a=0;a<num;a++){
      Ans+=price[a];
    }
    System.out.println(Ans);
  }
}