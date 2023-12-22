import java.util.*;
import java.lang.Math;

public class Main{
    
    
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(); 
        double b=sc.nextDouble();
        b=b*100;
        long result=0;
        if(a==0 || b==0)
        System.out.println(0);
        else{
        result=(long)((a*b)/100);
        System.out.println(result);
        }
        
    }
}