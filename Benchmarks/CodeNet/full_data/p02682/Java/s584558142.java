import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long k = sc.nextLong();
      long sum =  0L;
      for(int i=0;i<k;i++){
        if(a!=0){
          sum +=1;
          a--;
        }
        else if(b!=0){
          sum += 0;
          b--;
        }
        else{
          sum -=1;
          c--;
        }
      }
      System.out.println(sum);

    
     

      
    }
}