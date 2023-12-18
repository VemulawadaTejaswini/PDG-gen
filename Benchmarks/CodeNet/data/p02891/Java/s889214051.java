import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			long k = sc.nextLong();
			long count = 0;
			long count2 = 0;
			int n = s.length;
			
			char[] t = new char[2*n];
			
			for(int i=0;i<n;i++) {
				t[i] = s[i];
			}
			for(int i=n;i<2*n;i++) {
				t[i] = s[i-n];
			}
			
			for(int i=0;i<n-1;i++) {
				if(s[i]==s[i+1]) {
					s[i+1]='A';
					count++;
				}
			}
			
			for(int i=0;i<2*n-1;i++) {
				if(t[i]==t[i+1]) {
					t[i+1]='A';
					count2++;
				}
			}
			/*for(int i=0;i<2*n;i++) {
				System.out.println(t[i]);
			}
			
			System.out.println(count);
			System.out.println(count2);*/
			
			if(k%2==0) {
				System.out.println(count2*k/2L);
			}else {
				System.out.println((k/2L)*count2+count);
			}
			
	    }
		
	}
	
