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
				if(n==0 && s==0)break;
				ans=0;
				func(0,n,s);
				System.out.println(ans);
			}
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
	private static void func(int min,int n,int s){
		if(s<min*n)return;
		if(n==1){
			if(s<10)ans+=1;
		}else{
			for(int i=min;i<=s/n;i++)func(i+1,n-1,s-i);
		}
	}
}