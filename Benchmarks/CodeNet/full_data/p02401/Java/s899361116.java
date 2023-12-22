import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) throws IOException{
		while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			String[] in = line.split(" ");
			int a;
			if(in[1].equals("+"))
				System.out.println(Integer.parseInt(in[0]) + Integer.parseInt(in[2]));
			else if (in[1].equals("-"))
				System.out.println(Integer.parseInt(in[0]) - Integer.parseInt(in[2]));
			else if (in[1].equals("*"))
				System.out.println(Integer.parseInt(in[0]) * Integer.parseInt(in[2]));
			else if (in[1].equals("/"))
				System.out.println(Integer.parseInt(in[0]) / Integer.parseInt(in[2]));
			else break;
		}
	}
}