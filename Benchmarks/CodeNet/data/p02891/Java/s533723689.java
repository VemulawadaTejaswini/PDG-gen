import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		long K = stdIn.nextInt();
		char[] s = S.toCharArray();
		int n = S.length();
		int count = 0;
		
		for(int i = 0; i < n;) {
			int temp = 1;
			while(i < n-1 && s[i] == s[i+1]) {
				temp++;
				i++;
			}
			if(temp > 1) count += temp/2;
			i++;
		}
		
		if(s[0] == s[n-1]) {
			int i = 0;
			int j = n-1;
			while(i < n-1 && s[i] == s[i+1]) {
				i++;
			}
			while(j > 0 && s[j] == s[j-1]) {
				j--;
			}
			i = i+1;
			j = n-1-j+1;
			if(i == n) {
				System.out.println(n*K/2);
			}else {
				count = count-i/2-j/2;
				
				System.out.println(count*K+((i+j)/2)*(K-1)+i/2+j/2);
			}
		}
		else {
			System.out.println(count*K);
		}

	}

}