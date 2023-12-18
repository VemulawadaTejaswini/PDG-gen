import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static long givenFunc(long b, long n){
        if (n<b) return n;
        else return givenFunc(b,n/b)+n%b;
    }
    public static long solve(long N, long S){
        //when b is small enough, we can check it with the definition of func
        long b;
        for(b=2;b*b<=N;b++){
        	if(givenFunc(b,N)==S) return b;
        }
        b++;
        
        //when b>sqrt(N), f(b,N)=N+1-b
        if(givenFunc(b,N)>=S) return N+1-S;
        
        return N==S ? N+1 : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long S = sc.nextLong();
        System.out.println(solve(N,S));
    }
}
