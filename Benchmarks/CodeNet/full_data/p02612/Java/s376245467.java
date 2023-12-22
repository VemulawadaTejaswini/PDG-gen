import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int rem=x%1000;
        
        if(rem==0)
        System.out.println("0");
        else
        {
            rem=1000-rem;
        
        System.out.println(rem);
     }}
}