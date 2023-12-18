import java.util.*;
import java.util.Arrays;
public class Main{
    public static boolean check(double k){
        for(int i=0;i*i<=k;i++){
            if(i*i==k){
                return true;
            }
           
        }
        return false;
    }
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int k =0;
        if(check((a+b)/2)){
            k = (int)((a+b)/2);
            System.out.println(k);


        }
        else{
            System.out.println("IMPOSSIBLE");
        }
        
    }
   
    
       
    
}