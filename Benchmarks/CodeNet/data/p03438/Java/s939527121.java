import java.util.*;
import java.io.*;

public class Main {
    public static long sum(long[] array){
    	int l = array.length;
    	long ans = 0;
    	for(int i=0;i<l;i++) ans += array[i];
    	return ans;
    }
    
    public static void answer(boolean ans){
    	if(ans) System.out.println("Yes");
    	else System.out.println("No");
    	System.exit(0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        for(int n=0;n<N;n++) a[n]=sc.nextLong();
        for(int n=0;n<N;n++) b[n]=sc.nextLong();
        
        long opNum = sum(b)-sum(a);
        if(opNum<0) answer(false);
        
        long[] aOpNum = new long[N];
        long[] bOpNum = new long[N];
        for(int n=0;n<N;n++){
        	if(a[n]>=b[n]){
        		aOpNum[n]=0;
        		bOpNum[n]=a[n]-b[n];
        	}else{
        		aOpNum[n]=(a[n]+1-b[n])/2;
        		bOpNum[n]=(b[n]-a[n])%2;
        	}
        }
        answer(sum(aOpNum)<=opNum && sum(bOpNum)<=opNum);
        
    }
}