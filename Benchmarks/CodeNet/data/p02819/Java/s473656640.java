import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x==2){
      System.out.println(3);
      return;
    }
    for(int i=x+2;i<x*10000;i+=2){
      boolean flag = true;
      for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0)flag=false;
      }
      if(flag){
        System.out.println(i);
        return;
      }
    }
  }
}