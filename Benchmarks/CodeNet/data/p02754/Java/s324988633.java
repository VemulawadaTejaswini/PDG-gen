import java.util.*;
import java.io.*;
public class Main{
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(a==0){
            System.out.println(0);
        }
        else if(n<(a+b)){
            System.out.println(a);
        }
        else{
            long div=n/(a+b);
            long rem=n%(a+b);
            long sum=div*a+rem;
            System.out.println(sum);
        }


    }
}