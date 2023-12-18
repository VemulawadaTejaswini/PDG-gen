import java.util.*;
public class Main {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
       
   
       long a = input.nextLong();
       long b = input.nextLong();
       long x = input.nextLong();
       long c = 0;
       for(long i=a; i<=b; i++){
           if(i%x==0)
               c++;
           
       }
       
       
       System.out.println(c);
       
    }
}