import java.util.*;
import java.lang.*;

public class Main{

  public static void main(String[] args){
  


        Scanner s=new Scanner(System.in);
        long x=s.nextLong();
        long tt=(long)Math.ceil((double)Math.log10( (double)((long)x)/(double)100)/(double)Math.log10((double)101/(double)100));
        //System.out.println(tt);
        if(x>=800) {
            System.out.println((int) Math.ceil(tt)+57);
        }
else{
            System.out.println(tt);
        }
    
  }
  
  
}