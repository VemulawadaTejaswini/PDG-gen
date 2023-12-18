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
		int cnt = 0;
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
			if(c=='g'){
				cnt++;
			}else{
				cnt--;
			}
		}
		cnt = cnt/2;
		sb.append(cnt);
		System.out.print(sb);
	}
}