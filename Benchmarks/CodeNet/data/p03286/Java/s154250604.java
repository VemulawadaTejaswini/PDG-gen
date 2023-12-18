import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner fs=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int n=fs.readInt();
		
		int[] mbin=new int[30];
		mbin[0]=1;
		
		for(int i=0; i<29; i++){
			int m=-2;
			for(int j=0; j<i; j++){
				m*=-2;
			}
			mbin[i+1]=m;
		}
		disp(mbin);
		
		minusbin(n,0,mbin,"");
	}
	
	static void minusbin(int n, int d, int[] mbin, String mb){
		if(d<mbin.length && Math.abs(n)>=Math.abs(mbin[d])){
			minusbin(n-mbin[d], d+1, mbin, "1"+mb);
			minusbin(n, d+1,mbin, "0"+mb);
		}else if(n==0){
			System.out.println(mb);
		}
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
