import java.lang.*;
import java.io.*;

class MAIN{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader

(new InputStreamReader(System.in));
		String str = br.readLine();
		int x = Integer.parseInt(str);
		System.out.println(sanjo(x));
	}
	public static int sanjo(int x){
		int y = x * x * x;
		return y;
	}
}