import java.util.*;
import java.io.*;
public class Main1 {
public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int ans = 0;
	String var = "CODEFESTIVAL2016";
	for(int i = 0;i < str.length();i++){
		if(str.charAt(i) != var.charAt(i))++ans;
	}
	System.out.print(ans);
}
}