import java.util.*;

public class Main {
	static int count=0;
	static int www=0;
	static int n=0;
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] list=new int[n];
		www=0;
		for(int i=0;i<n;i++){
			list[i]=sc.nextInt();
			if(list[i]==0)www++;
		}

		count=0;
		rec(0,list,0);
		//System.out.println("     "+www+" "+count);
		if(www!=0){
			for(int i=0;i<www;i++)count=count*2;
		}
		System.out.println(""+count);
	}
	public static int rec(int sum,int[] list,int ccc){
//		System.out.println(""+count+" "+n+" "+sum+" "+ccc);
		if(n==ccc+1){
			if(sum==list[list.length-1])count++;
			return 0;
		}			
		if(list[ccc]==0){
//			www++;
			rec(sum,list,ccc+1);
		}
		else {
			if(sum+list[ccc]<=20/*&&sum+list[ccc]>=0*/)rec(sum+list[ccc],list,ccc+1);		
			if(sum>=list[ccc]&&/*sum-list[ccc]<=20&&*/sum-list[ccc]>=0)rec(sum-list[ccc],list,ccc+1);
		}
		return 0;
	}
	
}