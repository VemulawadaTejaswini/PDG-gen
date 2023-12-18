import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		int[] num=sc.readIntL();
		int[] ck=new int[2];
		ck[0]=num[0];
		ck[1]=num[1];
		int t=0;
		int d=0;
		
		for(int i=num[2]; i>0; i--){
			if(t==0){
				if(ck[0]%2==1){
					ck[0]-=1;
				}
				d=ck[0]/2;
				ck[0]-=d;
				ck[1]+=d;
			}else{
				if(ck[1]%2==1){
					ck[1]-=1;
				}
				d=ck[1]/2;
				ck[1]-=d;
				ck[0]+=d;
			}
			
			t=(t==0)? 1: 0;
		}
		
		disp(ck);
		//System.out.println("");
	}

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
	
	static void disp(long[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		BufferedReader read=null;
		StringTokenizer tok=null;
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
