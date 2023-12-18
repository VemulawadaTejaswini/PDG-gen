import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    long a=sc.nextLong();
    long b=sc.nextLong();
    long x=sc.nextLong();
    long k=0;
    sc.close();

    if((a%x+b%x)==0){
      k=(b-a)/x+1;
    }else if((a%x+b%x)==1){
      k=(b-a)/x+1;
    }else{
      k=b/x-a/x;
    }
    System.out.println(k);
  }
}