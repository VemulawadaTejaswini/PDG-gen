
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
		HashMap<Integer,Integer> jj1=new HashMap<>();  //n1>n2

		HashMap<Integer,Integer> jj2=new HashMap<>(); //n1<n2
		
		for (int i = 1; i < arr.length; i++) {
			jj1.put(i+arr[i],jj1.getOrDefault(i+arr[i],0)+1);
		}
		for (int i = 1; i < arr.length; i++) {
			jj2.put(i-arr[i],jj2.getOrDefault(i-arr[i],0)+1);
		}
		
		
		for (int i = 1; i < arr.length; i++) {
			int tt1=i-arr[i];
			int tt2=i+arr[i];
			if(jj1.containsKey(tt1)) {
				ans+=jj1.get(tt1);
			}
			if(jj2.containsKey(tt2)) {
				ans+=jj2.get(tt2);
			}
		}
		
		System.out.println(ans/2);

	}


}