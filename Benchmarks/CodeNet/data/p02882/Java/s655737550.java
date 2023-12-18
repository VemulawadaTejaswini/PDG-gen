import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextInt();
    double b=sc.nextInt();
    double x=sc.nextInt();
    double S=x/a;

      if(S<=a*b/2){
        double m=2*S/b;
        Math.atan(b/m);
        System.out.println(Math.toDegrees(Math.atan(b/m)));
      }else{
        double N=a*b-S;
        double o=2*N/a;
        System.out.println(Math.toDegrees(Math.atan(a/o)));
      }
    }
  }
