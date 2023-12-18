import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int a=s/1000;
    int b=s/100%10;
    int c=s/10%10;
    int d=s%10;
    if(a+b+c+d==7){
      System.out.print(a+"+"+b+"+"+c+"+"+d);
    }else if(a+b+c-d==7){
      System.out.print(a+"+"+b+"+"+c+"-"+d);
    }else if(a+b-c+d==7){
      System.out.print(a+"+"+b+"-"+c+"+"+d);
    }else if(a+b-c-d==7){
      System.out.print(a+"+"+b+"-"+c+"-"+d);
    }else if(a-b+c+d==7){
      System.out.print(a+"-"+b+"+"+c+"+"+d);
    }else if(a-b+c-d==7){
      System.out.print(a+"-"+b+"+"+c+"-"+d);
    }else if(a-b-c+d==7){
      System.out.print(a+"-"+b+"-"+c+"+"+d);
    }else{
      System.out.print(a+"-"+b+"-"+c+"-"+d);
    }
    System.out.println("=7");
  }
}