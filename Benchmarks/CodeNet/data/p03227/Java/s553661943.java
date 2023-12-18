import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		String[] t=sc.readStringL("");
		int l=t.length;
		if(l%2==0){
			for(int i=0; i<l; i++){
				System.out.print(t[i]);
			}
		}else{
			for(int i=l-1; i>=0; i--){
				System.out.print(t[i]);
			}
		}
		System.out.println("");
	}
	
	static int lcm(int a, int b){
		return a*b/gcd(a,b);
	}
	
	static int gcd(int a, int b){
		int c=0;
		if(a<b){
			int t=a;
			a=b;
			b=t;
		}
		while(b!=0){
			c=a%b;
			a=b;
			b=c;
		}
		return a;
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
