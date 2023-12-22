import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
    int a=kbd.nextInt();
    int b=kbd.nextInt();
    int h=kbd.nextInt();
    int m=kbd.nextInt();

    double A=h*30+m*0.5;
    double B=m*6;
    double C=0;
    if(A-B>=0){
      C=A-B;
    }else{
      C=B-A;
    }
    if(C>180){
      C=360-C;
    }
    C=Math.toRadians(C);
    double x=b*Math.sin(C)*b*Math.sin(C);
    double y=(b*Math.cos(C)-a)*(b*Math.cos(C)-a);
    System.out.println(Math.sqrt(x+y));
 }
}