import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt();
        for(int i=1;i<n;i++){
            int b=sc.nextInt();
            a=a*b/gcd(a,b);
        }
        System.out.println(a);
    }
    
    static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        return gcd(b,a%b);
    }
}

