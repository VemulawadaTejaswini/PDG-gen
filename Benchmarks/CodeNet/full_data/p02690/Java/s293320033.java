import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int X =sc.nextInt();
    long x; long y;
    for(int i=1;;i++){
      for(int k=0;k<i;k++){
        x=i*i*i*i*i;
        y=k*k*k*k*k;
        if(x-y==X){System.out.println(i+" "+k);
                   System.exit(0);}
        if(x+y==X){System.out.println(i+" "+-k);
                   System.exit(0);}
      }
    }
  }
}