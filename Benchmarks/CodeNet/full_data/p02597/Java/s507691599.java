import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
	
		int n = scan.nextInt();
		String s = scan.next();
		char c[] = new char[n];
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			c[i] = s.charAt(i);
		}
		
		outside:for(int i=0;i<n;i++) {
			if(c[i] == 'W') {
				for(int j=n-1;j>=i;j--) {
					if(c[j] == 'R') {
						c[i] = 'R';
						c[j] = 'W';
						ans++;
						break;
					}else if(i==j) {
						break outside;
					}
				}
			}
		}
		
		System.out.println(ans);
		

	}
	

}
