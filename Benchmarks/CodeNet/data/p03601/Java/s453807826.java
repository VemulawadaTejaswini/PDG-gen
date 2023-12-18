import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    int maxA = 0;
    int maxB = 0;
    double max = 0;
    for(int i=0;i<=30;i++)
      for(int j=0;j<=30;j++)
        for(int k=0;k<=1000;k++)
          for(int l=0;l<=1000;l++){
            if((a*i+b*j)*e>=c*k+d*l&&100*a*i+100*b*j+c*k+d*l<=f){
              double per = (double)(100*(100*a*i+100*b*j))/(100*a*i+100*b*j+c*k+d*l);
              if(per>max){
                maxA = 100*a*i+100*b*j+c*k+d*l;
                maxB = c*k+d*l;
              }
            }
          }
    System.out.println(maxA+" "+maxB);
  }
}