import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt() ;
		String s[] = new String[n];
		int acount = 0;
		int bcount = 0;
		int abcount = 0;
		int count = 0;
		for(int i = 0; i <  n; i++) {
			s[i] = sc.next();
			if(s[i].contains("AB")) {
				count++;
			}
			if( (s[i].charAt(0) == 'B') && (s[i].charAt(s[i].length() - 1) == 'A') ) {
				abcount++;
			}else if(s[i].charAt(0) == 'B') {
				bcount++;
			}else if(s[i].charAt(s[i].length() - 1) == 'A') {
				acount++;
			}
		}
		sc.close();
		if(abcount >= 2) {
			count += abcount - 1;
		}
		if(abcount >= 1) {
			if(acount >=1) {
				count++;
				acount--;
			}
			if(bcount >= 1) {
				count++;
				bcount--;
			}
		}
		if((acount >= 1) && (bcount >=1)) {
			count += Math.min(acount, bcount);
		}
		System.out.println(count);

	}
}