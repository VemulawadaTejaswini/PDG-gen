import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		int[] arg=sc.readIntL();
		int[] ca=sc.readIntL();
		int[] cb=sc.readIntL();
		Arrays.sort(ca);
		Arrays.sort(cb);
		int x=arg[2];
		int y=arg[3];
		
		boolean w=true;
		//disp(ca);
		//disp(cb);
		
		List<Integer> l=new ArrayList<Integer>();
		
		for(int z: ca){
			if(x<z && z<=y){
				l.add(z);
			}
		}
		
		for(int z: cb){
			if(x<z && z<=y){
				l.add(z);
			}
		}
		
		//System.out.println(l);
		
		for(int z: l){
			if(ca[ca.length-1]<z && z<=cb[0]){
				w=false;
			}
		}
		
		System.out.println((w==true)? "War": "No War");
	}
	
	static void solve(int cur, int nx, int en, int hld){}

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
