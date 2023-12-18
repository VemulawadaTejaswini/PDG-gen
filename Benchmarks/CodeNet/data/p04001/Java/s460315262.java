import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
        	String a = cin.next();       	
        	System.out.println(getResult(a));
        }
    }
    public static long getResult(String s){
    	long[] f = f(s.length());
    	long result=0;
    	int len = s.length();
    	for(int l=1;l<=len;l++){
    		for(int p=0;p<len+1-l;p++){
        		result += f[p]*f[len-l-p]*Long.parseLong(s.substring(p, p+l));
        	}
    	}
    	return result;
    }
    public static long[]  f(int n){
    	long[] f = new long[n+1];
    	f[0] = 1;
    	for(int i=1;i<=n;i++) f[i] = (long)Math.pow(2.0, (double)(i-1));
    	return f;
    }
}