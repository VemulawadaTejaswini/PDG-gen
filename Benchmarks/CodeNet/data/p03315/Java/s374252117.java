import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static int tc;
	static final int MOD=1_000_000_007;
	public static long[] inputArray(String str){
		String[] s=str.split(" ");
		long[] array=new long[s.length];
		for(int i=0;i<s.length;i++) {
			array[i]=Long.parseLong(s[i]);
		}
		return array;
	}
	public static void main(String[] args)throws IOException {
		//tc=Integer.parseInt(br.readLine());
		tc=1;
		while(tc-->0) {
			String str=br.readLine();
			int plus=0;
			int minus=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='+')
					plus++;
				else
					minus++;
			}
			System.out.println(plus-minus);
		}
	}
}