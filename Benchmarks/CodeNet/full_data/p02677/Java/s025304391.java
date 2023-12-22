 import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int H=sc.nextInt();
    int M=sc.nextInt();
    double x=M*6;
    double y=H*30+M*0.5;
    double t=Math.abs(x-y);
    double rad=t*3.141592653589/180;
    double cos=Math.cos(rad);
    double X=Math.sqrt((A*A)+(B*B)-(2*A*B*cos));
    System.out.println(X);
  }
}  