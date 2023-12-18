import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
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
			else{
				count = 0; c = false; b = true;
			}
		}
		System.out.println(res);
	}

}
