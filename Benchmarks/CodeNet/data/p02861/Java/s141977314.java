import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    float stair=num;
    for(int a=num-1; a>1; a--){
      stair*=a;
    }
    double Ans=0;
    int x[]=new int[num];
    int y[]=new int[num];
    for(int a=0; a<num; a++){
      x[a]=scan.nextInt();
      y[a]=scan.nextInt();
    }
    for(int a=0; a<num-1; a++){
      for(int b=a+1; b<num; b++){
        Ans+=Math.sqrt(((x[a]-x[b])*(x[a]-x[b]))+((y[a]-y[b])*(y[a]-y[b])))*(stair-2);
      }
    }
    System.out.println(Ans/stair);
  }
}