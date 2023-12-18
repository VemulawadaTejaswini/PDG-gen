

import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		long n= sc.nextLong()+1;
	
		int count=0;
		
		String str="";
		
		int ans =count(str,count,n);
		
		
		
		System.out.println(ans);
	}
	
	public static int count(String str,  int count, long n){
		if(n<357)return 0;
		
			
			if(Long.parseLong(str+3)>n)return count;
			else if(str!="" && Long.parseLong(str)>34){
				if(str.indexOf('5')==-1 || str.indexOf('7')==-1);
				else count++;
			}
			count=count(str+3,count, n);
			
			if(Long.parseLong(str+5)>n)return count;
			else if(str!="" && Long.parseLong(str)>34){
				if(str.indexOf('3')==-1 || str.indexOf('7')==-1);
				else count++;
			}
			count=count(str+5,count, n);
			
			if(Long.parseLong(str+7)>n)return count;
			else if(str!="" && Long.parseLong(str)>34){
				if(str.indexOf('5')==-1 || str.indexOf('3')==-1);
				else count++;
			}
			count=count(str+7,count, n);
			
		return count;
	}
	
	

}

