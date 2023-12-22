import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a;
    String s;
    String card=sc.next();
    String card2;
    while(true){
      if(card.startsWith("-")) break;
      while(true){
        s=sc.next();
        try{
            a=Integer.parseInt(s);
            card2=card.substring(0,a);
            card=card.substring(a);
            card=card+card2;
        }catch(NumberFormatException e){
            System.out.println(card);
            card=s;
            break;
        }
      }
    }
  }
}
