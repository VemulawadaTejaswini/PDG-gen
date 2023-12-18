


import java.io.*;

import java.util.*;

class pair{
	int a ;int b;
	public pair(int a,int b){
		this.a=a;
		this.b=b;
	}}

public class Main {
	

	public static void main(String[] args) throws IOException 
	{ 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n+1];
		
		
		for (int i = 1; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
				long ans=0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]+arr[i]==Math.abs(i-j))
					ans++;
			}
		}
		System.out.println(ans);
		
		
			

	}


}