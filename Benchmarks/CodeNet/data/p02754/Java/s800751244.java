import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n,a,b,sum=0;
    n=sc.nextLong();
    a=sc.nextLong();
    b=sc.nextLong();
    
    for(long i=1;i<=n;i++){
      if((i%(a+b))<=a&&(i%(a+b))>0){
        sum+=1;
      }
    }
    System.out.print(sum);
  }
}