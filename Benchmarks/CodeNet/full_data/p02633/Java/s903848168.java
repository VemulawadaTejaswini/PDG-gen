package codeforces;
import java.util.*;
import java.io.*;

public class chef1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		if(n<=90)
		System.out.println(360/n);
		else
			System.out.println(360/(180-n));
	}
}
