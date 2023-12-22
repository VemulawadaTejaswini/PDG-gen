import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			while(true){
				int n=scan.nextInt();
				int s=scan.nextInt();
				if(n==0 && s==0){
					break;
				}
				int ans=func(0,n,s);
				System.out.println(ans);
			}
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
	private static int func(int min,int n,int s){
		int ans=0;
		//System.out.println(min+" "+n+" "+s);
		if(s<min*n){
			return 0;
		}
		switch(n){
			case 1:
				ans=1;
				break;
			case 2:
				while((min+ans)<s-(min+ans)){
					ans+=1;
				}
				break;
			default:
				for(int i=min;i<=s;i++){
					int tempAns=func(i+1,n-1,s-i);
					//System.out.println((i+1)+" "+(n-1)+" "+(s-i));
					if(tempAns==0){
						break;
					}
					ans+=tempAns;
				}
				break;
		}
		//System.out.println("a");
		return ans;
	}
}