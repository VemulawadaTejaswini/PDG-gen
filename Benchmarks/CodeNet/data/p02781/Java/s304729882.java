import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] n = sc.next().toCharArray();
		int k = sc.nextInt();
		
		int len = n.length;
		int ans = 0;
		
		if(k==1) {
			ans = (len-1) * 9 + (n[0]-'0');
		}
		else if(k==2 && len>=2) {
			ans = (len-1) * (len-2) / 2 * 81;
			int zero = 0;
			int a = n[0] - '0';
			for(int i=1;i<len;i++) {
				int b = 0;
				if(zero<i-1) {
					b = 9;
				}
				else {
					b = n[i]-'0';
				}
				
				ans = ans + (a-1) * 9 + b;

				if(n[i]=='0')
					zero++;
			}
		}
		else if(k==3 && len>=3){
			ans = (len-1) * (len-2) * (len-3) / 3 / 2 * 729;
			int zeroi = 0;
			int a = n[0]-'0';
			for(int i=1;i<len;i++) {
				int b = 0;
				if(zeroi<i-1) {
					b = 9;
				}
				else {
					b = n[i]-'0';
				}
				
				int zeroj = 0;
				for(int j=i+1;j<len;j++) {
					int c = 0;
					if(zeroj<j-i-1) {
						c = 9;
					}
					else {
						c = n[j]-'0';
					}
					
					ans = ans + (a-1) * 81 + ( (b - 1) * 9 + c);
					
					if(n[j]=='0')
						zeroj++;
				}
				
				if(n[i]=='0')
					zeroi++;
			}
		}
		
		System.out.println(ans);
	}

}
