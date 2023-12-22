//package gfg;
import java.io.*;


public class Main {

	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine().trim());
	int res=(t*t*t);
	int r=res;
	for(int i=0;i<2;i++) {
		res=(res/t);
		r+=res;
	}
	System.out.println(r);
	
	
	}
	
	
	
	
	
	

}
