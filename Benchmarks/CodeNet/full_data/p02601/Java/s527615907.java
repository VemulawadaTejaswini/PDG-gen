import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] lo = reader.readLine().split(" ");
		int a= Integer.parseInt(lo[0]);
		int b= Integer.parseInt(lo[1]);
		int c= Integer.parseInt(lo[2]);	
		int k = Integer.parseInt(reader.readLine());
		while(b<a && k>0){
			b=b<<1;
			k--;
		}
		while(c<b && k>0){
			c=c<<1;
			k--;
		}
		while(k>0){
			c=c<<1;
			k--;
		}
		if(c>b && b>a) System.out.println("Yes");
		else System.out.println("No");
	}
}
