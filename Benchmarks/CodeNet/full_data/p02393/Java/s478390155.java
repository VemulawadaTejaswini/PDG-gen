import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		int a, b, c, max, middle, bottom;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String[] line = br.readLine().split(" ");
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			c = Integer.parseInt(line[2]);
			
			Arrays.sort(line);
			
			System.out.println(line[0]+" "+line[1]+" "+line[2]);
		} catch(Exception e){
		}
	}
}