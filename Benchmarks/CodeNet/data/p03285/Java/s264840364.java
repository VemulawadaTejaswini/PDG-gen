import java.io.*;
import java.util.*;

public class template
{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		if(n%4==0 || n%7==0 || n%11==0 || n%15==0 ||n%18==0||n%19==0||n%25==0||n%23==0||n%32==0||n%27==0||n%39==0||n%31==0||n%46==0||n%35==0||n%53==0||n%39==0||n%60==0||n%43==0||n%67==0||n%47==0||n%74==0||n%51==0||n%81==0||n%55==0||n%91==0||n%59==0||n%95==0||n%63==0||n%67==0||n%71==0||n%75==0||n%79==0||n%83==0||n%87==0||n%91==0||n%95==0||n%99==0)
			out.println("Yes");
		else
			out.println("No");
		out.flush();		
	}
}
/**

**/