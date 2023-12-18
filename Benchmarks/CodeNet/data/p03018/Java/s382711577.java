import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
//		System.out.println(process(line));
		char[] in = line.toCharArray();
		boolean c = false, b = true;
		long count = 0; long res = 0;
		for(int i = in.length-1; i >= 0; i--){
			if(b && in[i] == 'C'){
				b = false; c = true;
			}
			else if(c && in[i] == 'B'){
				b = true; count++; c = false;
			}
			else if(b && in[i] == 'A'){
				res += count;
			}
			else if(in[i] == 'C'){
				count = 0; c = true; b = false;
			}
			else{
				count = 0; c = false; b = true;
			}
		}
		System.out.println(res);
	}
	
	static long process(String line){
		long count = 0;
		while(true){
			String newline = line.replaceFirst("ABC", "BCA");
			if(newline.equals(line)) break;
			line = newline;
			count++;
		}
		return count;
	}

}
