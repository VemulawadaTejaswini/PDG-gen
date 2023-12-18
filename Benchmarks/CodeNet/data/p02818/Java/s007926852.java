import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

            if(a+b<=k){
                a=0;
                b=0; 
                //System.out.println("1");
            }else if(a<k){
                b=b-(k-a);
                a=0;
               // System.out.println("2");
            }else{
                a=a-k;
                b=b;
               // System.out.println("3");

            }
    System.out.println(a+" "+b);

    }
}
