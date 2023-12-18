import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=-1;
    boolean flg=false;
    for(double i=0.0;i<1000;i++){
      if(i*0.08==a && i*0.1==b){
        c=i;
      }
    }
    System.out.println(c);
  }
}