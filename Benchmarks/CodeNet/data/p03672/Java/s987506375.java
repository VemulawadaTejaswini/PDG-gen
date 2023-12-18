import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] SS = br.readLine().split("") ;
		int LEN = SS.length/2;
		
		int ans = 0;
		for(int i=LEN-1; i>0; i--) {
			boolean LequalR = true;
			for(int j=0; j<i; j++) {
				if(!SS[j].contentEquals(SS[j+i])) {
					LequalR = false;
				}
			}
			if(LequalR) {
				ans = i*2;
				break;
			}
		}
			
		System.out.println(ans);	
	}
}