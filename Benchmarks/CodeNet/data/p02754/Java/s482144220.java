import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        long rem=n%(a+b)<a?n%(a+b):a;
        long res=n/(a+b)*a+rem;
        System.out.println(res);
    }
}