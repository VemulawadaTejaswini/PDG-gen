import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    int H=in.nextInt();
    int M=in.nextInt();
    
    double t=(2*3.14*H)/12+(2*3.14*M)/(12*60);
    double t1=(2*3.14*M)/60;
    double p=A*t;
    double p1=B*t1;
    double y=Math.abs(p-p1);
    System.out.println(y);
  }
}

    
    
    