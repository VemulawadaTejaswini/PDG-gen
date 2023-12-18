import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x=sc.nextInt();
    double ok=0;
    double ng=90;
    for(int i=0;i<300;i++){
      double check=ok+(ng-ok)/2;
      if(calc(a,b,x,check)){
        ok=check;
      }else{
        ng=check;
      }
    }
    System.out.println(ok);
  }
  static boolean calc(double a,double b,double x,double c){
    double cc=Math.toRadians(c);
    if(cc>Math.atan2(b,a)){
      return (a*b*b/Math.tan(cc)/2>=x);
    }else{
      return (a*a*b-a*a*a*Math.tan(cc)/2>=x);
    }
  }
}