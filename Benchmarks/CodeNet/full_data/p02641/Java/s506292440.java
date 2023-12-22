import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.lang.Math;
import java.util.HashMap;
public class Main {
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
    	int x=sc.nextInt();
    	int n=sc.nextInt();
    	List<Integer>a=new ArrayList<Integer>();
    	if(n!=0) {
    	for(int i=0;i<n;i++) {
    		a.add(sc.nextInt());
    	}
    	Collections.sort(a);
    	if(x<a.get(0)) {
    		System.out.println(0);
    	}else if(x>a.get(n-1)) {
    		System.out.println(x+1);
    	}else {
    		int min=101,ans=0;
    		for(int i=a.get(0);i<=a.get(n-1);i++) {
    			if(min>Math.abs(i-x)&& !a.contains(i)) {min=Math.abs(i-x);
    			ans=i;}
    			}
    		System.out.println(ans);
    		}
    	}else {
    		System.out.println(x);
    	}
    }
}
