//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char n[] = N.toCharArray();
		//boolean ok[] = new boolean[3];
		//Arrays.fill(ok, true);
		int count = 0;
		for(int i=0;i<3;i++) {
		//System.out.println(n[i]);
			if(n[i] == '7') {
				count ++;
			}
		}
		if(count>0) {
	System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}