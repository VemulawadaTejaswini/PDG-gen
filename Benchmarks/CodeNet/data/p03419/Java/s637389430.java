import java.util.*;
import java.io.*;

public class Main {
    public static long ans(long N, long M){
    	if(N==1) return Math.abs(M-2);
    	else if(M==1) return Math.abs(N-2);
    	else return (N-2)*(M-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        System.out.println(ans(N,M));
        
    }
}