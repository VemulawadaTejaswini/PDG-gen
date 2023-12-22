import java.io.*;
import java.util.*;

public class Main{
	static int ans;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			while(true){
				int n=scan.nextInt();
				int s=scan.nextInt();
				if(n==0 && s==0){
					break;
				}
				ans=0;
				func(0,n,s);
				System.out.println(ans);
			}
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
		
	private static void func(int min,int n,int s){
		//System.out.println("Env:"+min+" "+n+" "+s);
		if(s<min*n){
			return;
		}
		switch(n){
			case 1:
				if(s<10){
					ans+=1;
					//System.out.println("a");
				}
				break;
				/*
			case 2:
				while(min<s-min){
					min+=1;
					ans+=1;
					System.out.println("b");
				}
				break;
				*/
			default:
				for(int i=min;i<=s/n;i++){
					//System.out.println("loop:"+i);
					func(i+1,n-1,s-i);
					
					//System.out.println("Ans:"+ans);
				}
				break;
		}
	}
}