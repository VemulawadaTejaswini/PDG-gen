import java.io.*;
import java.math.*;
import java.util.*;


public class Main	 {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	BigInteger f = new BigInteger(Integer.toString(n));
        	long arr[] = new long[n];
        	for(int i=0;i<n;i++) {
        		arr[i] = sc.nextLong();
        	}
        	Arrays.sort(arr);
        	BigInteger[] series = new BigInteger[n];
        	for(int i=0;i<n;i++) {
        		series[i] = new BigInteger(Long.toString(arr[i]));
        	}
        	BigInteger res = new BigInteger("1");
        	boolean flag =false;
        	BigInteger  b2 = new BigInteger("0"); 
        	BigInteger  b3 = new BigInteger("1000000000000000000");
        	for(int i=0;i<n;i++) {
        		res = res.multiply(series[i]);
        		int comparevalue = res.compareTo(b2); 
        		int comparevalue1 = res.compareTo(b3); 
        		if(comparevalue==0) {
        			System.out.println("0");
        			flag=true;
        			break;
        		}
        		else if(comparevalue1==1) {
        			flag=true;
        			System.out.println("-1");
        			break;
        		}
        	}
        	if(flag==false)
        		System.out.println(res);
    }
}
