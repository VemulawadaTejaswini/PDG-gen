package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public static void main(String args[]) throws IOException{
		//System.out.println("hello world");
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

		String str=br.readLine();
		int a=Integer.parseInt(str);
		System.out.println(a*a*a);
	}