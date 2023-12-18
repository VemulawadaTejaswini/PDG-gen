import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		int[] num=sc.readIntL();
		int[] chl=sc.readIntL();
		int itm=num[1];
		int cnt=0;
		int pay=0;
		Arrays.sort(chl);
		
		for(int i=0; i<chl.length-1; i++){
			//System.out.printf("%d/%d\n",itm,chl[i]);
			if(itm>0 && itm>=chl[i]){
				itm-=chl[i];
				cnt+=1;
			}
		}
		//System.out.printf("%d/%d\n",itm,chl[chl.length-1]);
		if(itm>0 && itm==chl[chl.length-1]){
			cnt+=1;
		}
		System.out.println(cnt);
	}
	
	static void solve(){}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%s ",data[i]);
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
			String buf=sc.nextLine();
			return Integer.parseInt(buf);
		}
		long readLong(){
			long i=Long.parseLong(sc.nextLine());
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
		
		String readString(){
			return sc.nextLine();
		}
		String[] readStringL(String dlm){
			String[] s=sc.nextLine().split(dlm);
			return s;
		}
	}
}
