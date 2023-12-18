import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    long n = sc.nextLong();
    long k = sc.nextInt();
    
    if(n>1000000000){
        n%=10000000;
    }
    
    while(true){
      
     long x = n-k;
      if(x < 0){
        x*=-1;
      }if(x==0){
          System.out.println(0);
          return;
        }
    
      
      if(n>x){
        n=x;
      }else{
        System.out.println(n);
        return;
      }
      
    }
  }
}