import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		for(int i;;i++){
			s = r.readLine();
			int a;
			a = Integer.parseInt(s);
			if (a==0) {
				break;
			}
			System.out.println("Case "+i+": "+a);
		}
	}
}