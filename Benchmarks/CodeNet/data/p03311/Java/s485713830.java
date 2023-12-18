import java.util.*;
import java.io.*;

class code{
	public static void main(String [] args){
		Input in = new Input();
		int n = in.readInt();
		int [] a = in.readArray();
		
		for(int i = 0; i < n; i++){
			a[i] -= i+1;
		}
		
		Arrays.sort(a);
		int b = a[n/2];
		
		int sum = 0;
		for(int i = 0; i < n; i++){
			int dif = a[i] - b;
			if(dif < 0){
				dif *= -1;
			}
			sum += dif;
		}
		
		System.out.println(sum);
	}
}

class Input{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String getLine(){
		String str = new String();
		try{
			str = br.readLine();
		}catch(Exception e){
			System.out.println(e);
		}
		return str;
	}
	
	public Integer readInt(){
		Integer num = -1;
		try{
			num = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println(e);
		}
		return num;
	}
	
	public int [] readArray(){
		String str = new String();
		try{
			str = br.readLine();
		}catch(Exception e){
			System.out.println(e);
		}
		StringTokenizer tokens = new StringTokenizer(str, " ");
		int len = tokens.countTokens();
		int [] a = new int [len];
		for(int i = 0; i < len; i++){
			a[i] = Integer.parseInt(tokens.nextToken());
		}
		return a;
	}
	
}