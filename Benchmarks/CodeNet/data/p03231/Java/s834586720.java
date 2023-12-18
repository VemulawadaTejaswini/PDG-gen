import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		FScanner sc=new FScanner();
		int[] num=sc.readIntL();
		int n=num[0];
		int m=num[1];
		String[] s=sc.readStringL("");
		String[] t=sc.readStringL("");
		int lc=lcm(n,m);
		Map<Integer,String> cans=new HashMap<Integer,String>();
		
		String[] ans=new String[lc+1];
		
		for(int i=0; i<ans.length; i++){
			ans[i]="";
		}
		int idx=0;
		boolean slv=true;
		
		for(int i=0; i<n; i++){
			idx=(i*(lc/n))+1;
			cans.put(idx,s[i]);
			ans[idx]=s[i];
		}
		
		for(int i=0; i<m; i++){
			idx=(i*(lc/m))+1;
			
			if(!cans.containsKey(idx) || cans.get(idx).equals(t[i])){
					cans.put(idx,t[i]);
			}else{
				cans.put(idx,"/");
				slv=false;
			}
		}
		/*for(int key: cans.keySet()){
			System.out.printf("%d:%s ",key,cans.get(key));
		}
		System.out.println("");*/
		System.out.println((slv==true)? lc: -1);
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
