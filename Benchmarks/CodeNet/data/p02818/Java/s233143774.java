import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a,b,k;
    a=scan.nextInt();
    b=scan.nextInt();
    k=scan.nextInt();
    if(a>=k){
      long temp = a-k;
      System.out.println(temp + " " + b);
    }else if(a+b>=k){
      long temp = a+b-k;
      System.out.println("0 "+ temp);
    }else{
      System.out.println("0 0");
    }
  }
}