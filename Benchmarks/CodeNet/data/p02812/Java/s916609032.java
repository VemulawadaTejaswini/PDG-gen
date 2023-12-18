import java.math.BigInteger;
import java.util.*;
public class Main {
	

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		String s = sc.nextLine();
		char[] chars = s.toCharArray();
		
		int ans = 0;
		for(int i=0; i< chars.length; i++) {
			if(chars[i] == 'A') {
				if(i + 2 >= chars.length) {
					break;
				}
				
				if(chars[i+1] == 'B' && chars[i+2] == 'C') {
					ans += 1;
				}
			}
		}
		
		System.out.println(ans);
		

		


		
		
	}
	


}

 