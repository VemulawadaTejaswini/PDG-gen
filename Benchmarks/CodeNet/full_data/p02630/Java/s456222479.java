
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.lang.Math;
import java.util.HashMap;
public class Main {
	static boolean isPrime(int n) 
    { 
        // Corner cases 
        if (n <= 1) return false; 
        if (n <= 3) return true; 
      
        // This is checked so that we can skip  
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
    } 
	public static int useBs(int[] arr, int targetValue) {	
		int a =  Arrays.binarySearch(arr, targetValue);
		if(a >=0 && a<arr.length)
			return a;
		else
			return -1;
	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	static boolean isPalindrome(String s) {
		int l=s.length();
		for(int i=0;i<l/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
				return false;
		}
		return true;
	}
	static String revString(String str)
	{
		return new StringBuffer(str).reverse().toString();
	}
	static String sortString(String s) {
		char a[]=s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	static int sumList(List<Integer>a) {
		return a.stream().mapToInt(Integer::intValue).sum();
	}
	static int sumArray(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
    public static void main(String[]args) throws java.lang.Exception{
    	Scanner sc=new Scanner(System.in);
    	int t=1;
    	while(t-->0) {
    		int n=sc.nextInt();
    		long s=0;
    		int arr[]=new int[n];
    		Map<Integer,Integer>a=new HashMap<Integer,Integer>();
    		for(int i=0;i<n;i++) {
    			arr[i]=sc.nextInt();
    			s+=arr[i];
    			if(!a.containsKey(arr[i]))a.put(arr[i], 1);
    			else a.put(arr[i],a.get(arr[i])+1 );
    		}
    		int q=sc.nextInt();
    		for(int i=0;i<q;i++) {
    			int b=sc.nextInt(),c=sc.nextInt();
    			if(a.containsKey(b)) {
    				if(a.containsKey(c)) {
    					int r=a.get(b);
    					a.remove(b);
    					a.put(c,a.get(c)+r);
    					s-=r*b;
    					s+=r*c;
    				}else {
    					int r=a.get(b);
    					a.remove(b);
    					a.put(c,r);
    					s-=r*b;
    					s+=r*c;
    				}
    				System.out.println(s);
    			}else {
    				System.out.println(s);
    			}
    		}
    	}
    }
}
