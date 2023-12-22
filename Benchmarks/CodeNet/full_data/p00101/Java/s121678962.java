import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    while(n-->0){
	        String line = br.readLine();
	        line = line.replaceAll("Hoshino","Hoshina");
	        System.out.println(line);
	    }
	}
}