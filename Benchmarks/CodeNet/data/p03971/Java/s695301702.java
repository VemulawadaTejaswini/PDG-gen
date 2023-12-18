import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main {
	
	
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] s = sc.next().toCharArray();
        String[] ans = new String[n];
        int rem = a+b;
        int remb = b;
        for(int i = 0; i < n; i++) {
        	if(s[i]=='a'&&rem>0) {
        		rem--;
        		ans[i]="Yes";
        	}
        	else if(s[i]=='b'&&rem>0&&remb>0) {
        		rem--;
        		remb--;
        		ans[i]="Yes";
        	}
        	else {
        		ans[i]="No";
        	}
        }
        for(int i = 0; i < n; i++) {
        	System.out.println(ans[i]);
        }
	}
}