
import java.util.*;

public class Main {
	static int num[] = new int[4];
	static String str = new String();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char c[] = s.toCharArray();
		
		for(int i=0;i<4;i++) {
			num[i] = c[i]-'0';
		}
		
		calc(0,num[0],String.valueOf(num[0]));
		System.out.println(str + "=7");
	}
	
	static void calc(int p, int tmp_sum, String tmp_str) {
		if(p==3) {
			if(tmp_sum==7) {
				str = tmp_str;
			}	
			return;
		}
		
		if(p<3) {
			calc(p+1,tmp_sum+num[p+1],tmp_str+"+"+num[p+1]);
			calc(p+1,tmp_sum-num[p+1],tmp_str+"-"+num[p+1]);
		}
			
	}
}
