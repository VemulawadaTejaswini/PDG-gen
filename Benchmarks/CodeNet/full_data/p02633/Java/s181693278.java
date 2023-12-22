
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		double x=360;
		double ans=0;
		if(n<=90)
			ans=Math.ceil(x/n);
		else
			ans=Math.ceil(x/(180-n));
		System.out.println((int)ans);
	}
}
