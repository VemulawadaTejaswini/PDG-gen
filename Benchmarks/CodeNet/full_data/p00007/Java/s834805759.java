package hoge.hoge.com;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args)  throws IOException
		{
		    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		    int week = Integer.parseInt(buf.readLine());
		    System.out.println(risi(week));
		}
	public static int risi(int num){
		double syakkin = 10;
		for(int i=0; i<num; i++){
			syakkin += syakkin*0.05;
		}
		return (int)Math.ceil(syakkin)*10000;
	}
}