import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		String b = "CODEFESTIVAL2016";
		int l = a.length();
		int cnt = 0;
		for(int i = 0; i < l; i++){
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);
			if(c1!=c2)cnt++;
		}
		sb.append(cnt);
		System.out.println(sb);
	}
}