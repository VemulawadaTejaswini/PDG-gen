//AMBIKESH JHA
//NEPAL
//NEVER GIVE UP TRYING...
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
		t:
		while(tc-->0) {
			int N=Integer.parseInt(br.readLine());
			int ans=1;
			for(int i=0;i<3;i++) {
				ans*=N;
			}
			System.out.println(ans);
		}
	}
}