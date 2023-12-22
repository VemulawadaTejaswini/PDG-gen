import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		String input = bf.readLine();
 		int j = -1;
 		boolean found = false;
 		for(j = 0;j<input.length();j++){
 			if (input.charAt(j) == 'R'){
 				found = true;
 				break;
 			}
 		}
 		int count = 1;
 		for(int k = j+1;k<input.length();k++){
 			if (input.charAt(k) == 'R')
 				count++;
 			else
 				break;
 		}
 		if (!found)
 			out.println(0);
 		else
 			out.println(count);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


