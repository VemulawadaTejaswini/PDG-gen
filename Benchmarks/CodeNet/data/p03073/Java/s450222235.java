
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = Integer.MAX_VALUE/2;
		int len = s.length();
		//01010101010
		int sum = 0;
		for(int i=0;i<len;i++) {
			if(i%2==0) {
				if(s.charAt(i)=='1')sum++;
			}
			else {
				if(s.charAt(i)=='0')sum++;
			}
		}
		
		ans = Math.min(ans, sum);
		
		//10101010101
		sum = 0;
		for(int i=0;i<len;i++) {
			if(i%2==0) {
				if(s.charAt(i)=='0')sum++;
			}
			else {
				if(s.charAt(i)=='1')sum++;
			}
		}
		ans = Math.min(ans, sum);
		
		System.out.println(ans);
	}
}

