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
		int l = a.length();
		boolean cf = false;
 
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
			if(c=='C')
				cf = true;
			if(cf && c=='F'){
				sb.append("Yes");
				System.out.println(sb);
				return;
			}
		}
 
		sb.append("No");
		System.out.println(sb);
	}
}