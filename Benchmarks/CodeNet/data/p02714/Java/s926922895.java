import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		char[]s = stdIn.next().toCharArray();
		long cnt = 0;
		
		for(int i = 0; i < n-2; i++) {
			int select1 = 0;
			if(s[i]=='R') {
				select1 = 1;
			}else if(s[i]=='G') {
				select1 = 2;
			}else {
				select1 = 3;
			}
			for(int j = 1; j < n-1; j++) {
				int select2 = 0;
				if(s[j]=='R') {
					select2 = 1;
				}else if(s[j]=='G') {
					select2 = 2;
				}else {
					select2 = 3;
				}
				if(select1 == select2) {
					continue;
				}
				for(int k = 2; k < n; k++) {
					int select3 = 0;
					if(s[k]=='R') {
						select3 = 1;
					}else if(s[k] =='G') {
						select3 = 2;
					}else {
						select3 = 3;
					}
					if((select1 != select2) && (select2 != select3) && (select3!= select1)) {
						if(j-i != k-j) {
							cnt++;
						}
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
