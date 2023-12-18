import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int[] l,r;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long n = Long.parseLong(br.readLine());
		int sn = (int)Math.floor(Math.sqrt(n));
		for(int i = sn; i < n+1; i++){
			if(n%i==0){
				int a = (int)n/i;
				int f = Math.max(String.valueOf(a).length(),String.valueOf(i).length());
				System.out.println(f);
				return;
			}
		}
	}
}
