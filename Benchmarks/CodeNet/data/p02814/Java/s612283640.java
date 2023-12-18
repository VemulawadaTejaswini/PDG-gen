import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        List<Long> list = new ArrayList<Long>();
        
        for(long i=0;i<n;i++){
            long a = sc.nextLong();
            list.add(a);
        }
        while(list.size() != 1){
            list.add(lcm(list.get(0),list.get(1)));
            list.remove(0);
            list.remove(0);
        }
        if(list.get(0)>=m){
            System.out.println("0");
            System.exit(0);
        }
        int kisu=0;
        
        long n1 = (long)((double)m/(double)list.get(0));
        long n2 = (long)((double)m/(double)list.get(0)+(double)0.5);
 
        if(n2-n1 == 1)kisu=1;
        System.out.println(m/list.get(0)+kisu);
    }
    
    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    
    static long lcm(long a,long b){
        long a2,b2;
        if(a<b){a2=b;b2=a;}
        else {a2=a;b2=b;}
        long c = gcd(a2,b2);
        return a*b/c;
    }
    
}
