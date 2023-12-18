import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    
    long i = 1;
    long j = 1;
    long a = 1;
    
    
    while(a<=n/a){
      if(n%a==0){
        i = a;
        j = n/i;
      }
      a++;
    }
    System.out.println(i+j-2);
  }
}