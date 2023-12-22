ipackage AtCoder2020May3Beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i*i<=n ;i++){
			if(n%i==0){
				al.add(i);
				al.add(n/i);
			}
		}
		Collections.sort(al);
	      
		for(int val : al){
			for(int i=0;i<=val;i++){
				//System.out.println(val);
				if(check(i,i-val,n)){
				      System.out.println(i+" "+(i-val));
				      return ;
				}
			}
		}
		System.out.println("a");

	}
	
	
	
	public  static  boolean check(long a , long b, int x){
		// System.out.println(a+" "+b);
		 long val1 = a*a*a*a*a;
		 long val2 = b*b*b*b*b;
		 if(val1-val2==(long)x){
			 return true;
		 }else{
			 return false;
		 }
	}

}