
import java.util.*;

public class Main{
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        long n=sc.nextLong();
        for(long  i=1;i<=10000001;i++) {
          if(((1l*i*(i+1)/2))%n==0) {
            System.out.println(i);
            break;
          }
        }

    

    
}
}