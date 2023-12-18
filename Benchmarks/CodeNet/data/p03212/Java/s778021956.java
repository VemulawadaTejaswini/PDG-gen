

import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		long n= sc.nextLong();
	
		int count=0;
		
		//String str="";
		
		int ans =count(0,count,n);
		
		
		
		System.out.println(ans);
	}
	
	public static int count(long n,  int count, long limit){
		if(limit<357)return 0;
		
		String str = String.valueOf(n);
			
			if(10*n+3>limit)return count;
			if(str.indexOf('5')!=-1 &&str.indexOf('7')!=-1)count++;
			count=count(10*n+3,count, limit);
			
			if(10*n+5>limit)return count;
			if(str.indexOf('3')!=-1 &&str.indexOf('7')!=-1)count++;
			count=count(10*n+5,count, limit);
			
			if(10*n+7>limit)return count;
			if(str.indexOf('5')!=-1 &&str.indexOf('3')!=-1)count++;
			count=count(10*n+7,count, limit);
			
		return count;
	}
	
	

}


