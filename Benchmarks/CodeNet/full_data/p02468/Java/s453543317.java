import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextLong(),n=sc.nextLong(),ans=1,p=m,mod=1000000007;
        while(n>0){
            if(n%2==0){
                p=p*p%mod;
                n=n/2;
            }else{
                ans=ans*p%mod;
                n--;
            }
        }
        System.out.println(ans);
    }
}

