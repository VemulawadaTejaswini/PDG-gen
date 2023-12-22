import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		Set<String> T=new HashSet<>();
		int n=cin.nextInt();
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			String odr=cin.next(),key=cin.next();
			if(odr.equals("insert"))T.add(key);
			else if(odr.equals("find") && T.contains(key))out.println("yes");
			else if(odr.equals("find") && !T.contains(key))out.println("no");
		}
		out.flush();
	}

}

