import java.io.*;
import java.util.*;

public class Main { //m-solutions2019 B -
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		int xs = 0;
		for(char c: in){
			if(c == 'x') xs++;
		}
		System.out.println(xs >= 8? "NO": "YES");
	}

}
