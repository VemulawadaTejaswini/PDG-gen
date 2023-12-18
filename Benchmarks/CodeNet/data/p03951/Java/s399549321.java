import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String t = br.readLine();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i+j==n){
					sb.append(s.substring(0,i)).append(t);
					System.out.println(sb.length());
					return;
				}
				char c1 = t.charAt(j);
				char c2 = s.charAt(i+j);
				if(c1!=c2){
					i+=j;
					break;
				}
				if(j==n-1){
					sb.append(s);
					System.out.println(sb.length());
					return;
				}
			}
		}
		sb.append(s+t);
		System.out.println(sb.length());
	}
}