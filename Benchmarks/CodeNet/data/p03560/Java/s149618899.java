import java.util.*;
import java.io.*;



public class Main {
    public static long digitSum(long k){
    	long sum = 0;
    	while(k>0){
    		sum+=k%10;
    		k=k/10;
    	}
    	return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for(int i=1;i<10000000;i++){
        	long x = digitSum(i*K);
        	if(x<ans) ans = x;
        }
        
        System.out.println(ans);
    }
}