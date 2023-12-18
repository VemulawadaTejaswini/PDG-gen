import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] buf=sc.nextLine().split(" ");		
		int[] num=new int[buf.length];
		
		for(int i=0; i<buf.length; i++){
			num[i]=Integer.parseInt(buf[i]);
		}
		
		int idx=1;
		int cnt=1;
		int ans=0;
		
		while(idx<num.length){
			cnt=1;
			if(num[idx-1]!=num[idx]){
				idx++;
			}else{
				while(idx<num.length && num[idx-1]==num[idx]){
					idx++;
					cnt++;
				}
			}
			if(cnt>1){
				ans+=cnt/2;
			}
		}
		System.out.println(ans);
	}
	
	static int rnd(){
		int r=1;
		Random rd=new Random();
		r=rd.nextInt(10000)+1;
		return r;
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
