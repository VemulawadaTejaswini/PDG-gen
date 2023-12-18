import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=-1;
    boolean flg=false;
    for(double i=0.0;i<=1000;i++){
      if((int)Math.floor(i*0.08)==a && (int)Math.floor(i*0.1)==b){
        c=(int)Math.floor(i);
      }
    }
    System.out.println(c);
  }
}
