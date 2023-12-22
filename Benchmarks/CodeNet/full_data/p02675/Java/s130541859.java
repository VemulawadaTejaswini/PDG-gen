import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b;
    if(a>10){
      b=a;
    }else(a>=10&&a<100){
      b=a%10;
    }else{
      b=a%100;
    }
    if(b==2||b==4||b==5||b==7||b==9){
      System.out.println("hon");
    }else if(b==3){
      System.out.println("bon");
    }else{
      System.out.println("pon");
    }
  }
}