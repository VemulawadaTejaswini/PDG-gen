import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		long N= Long.parseLong(reader.readLine());
		String res = "";
		boolean is = N%26==0?true:false;
		while(N>1){
			long p = N%26;
			N/=26;
			res = getCharForNumber((int)(p)) +res;			
		}
		res = N!=0 && !is?getCharForNumber((int)N) + res:res;
		System.out.println(res);
	}
	private static String getCharForNumber(int i) {
    	char[] alphabet = "zabcdefghijklmnopqrstuvwxyz".toCharArray();
    	return Character.toString(alphabet[i]);
	}
}
