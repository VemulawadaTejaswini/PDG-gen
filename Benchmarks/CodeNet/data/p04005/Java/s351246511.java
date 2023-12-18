import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long c = Long.parseLong(str[2]);
		if(a%2==0 || b%2==0 || c%2==0){
			sb.append(0);
			System.out.println(sb);
			return;
		}
		long min1 = Math.min(a,b);
		long min2 = Math.min(c,Math.max(a,b));
		sb.append(min1*min2);
		System.out.println(sb);
	}
}