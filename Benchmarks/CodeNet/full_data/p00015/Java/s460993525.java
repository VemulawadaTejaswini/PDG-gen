import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			BigInteger a = new BigInteger(br.readLine());
			BigInteger b = new BigInteger(br.readLine());
			ans.add(a.add(b).toString());
		}
		
		for (String a : ans)
			System.out.println(a);
		
	}
	
}