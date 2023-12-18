import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    for(int h=1;h<=3500;h++){
      for(int n=1;n<=3500;n++){
        if((h*n*x)%(4*h*n-n*x-h*x)==0){
          System.out.println(h+" "+n+" "+((h*n*x)/(4*h*n-n*x-h*x)));
        }
      }
    }
  }
}