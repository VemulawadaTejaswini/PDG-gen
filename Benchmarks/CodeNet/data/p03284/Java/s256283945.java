import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner fs=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int[] num=fs.readIntL();
		int n=num[0];
		int k=num[1];
		
		int[] s=new int[k];
		int idx=0;
		
		while(n>=1){
			s[idx]+=1;
			if(idx>=k-1){
				idx=0;
			}else{
				idx++;
			}
			n-=1;
		}
		int min=100;
		int max=1;
		for(int i=0; i<s.length; i++){
			if(min>s[i]){
				min=s[i];
			}
			if(max<s[i]){
				max=s[i];
			}
		}
		
		System.out.println(max-min);
		
	}
	
	

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			int i=Integer.parseInt(sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
			}
			return num;
		}
		String[] readStringL(){
			String[] s=sc.nextLine().split("");
			return s;
		}
	}
}
