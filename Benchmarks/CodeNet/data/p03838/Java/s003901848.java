import java.util.*;
public class Main{
    public static void main(String... args){
       Scanner scan = new Scanner(System.in);
       long x = scan.nextLong();
       long y = scan.nextLong();

       long res = 0;

       if(x < 0 && y < 0){
           if(y < x){
               res+=2;
           }
           x*=(-1);
           y*=(-1);
       }else if(y < 0){
           y*=(-1);
           res++;
       }else if(x < 0){
           x*=(-1);
           res++;
       }else if(y < x){
           res+=2;
       }

       if(x>0 && y == 0){
           res--;
       }else if(x<0 && y==0){
           res--;
       }

       res+= Math.max(x,y)-Math.min(x,y);

       System.out.println(res);
    }
}
