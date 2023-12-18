import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long x=sc.nextLong();
        long t=0;
        if((double)x==(double)n/2.0){
            System.out.println(3);return;
        }
        t+=3*x;
        t+=1*(n-x);
        t+=3;
        
        System.out.println(t);
    }
    
}
