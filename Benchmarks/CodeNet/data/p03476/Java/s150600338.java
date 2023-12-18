import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int M = sc.nextInt();
		System.out.println(24- M + 24);*/
		
	/*	int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		int length = s.length();
		if(a>=1 && a<=5 && b>=1 && b<= 5) {
			if((a+b+1) != length) {
				System.out.println("No");
				return;
			}else {
				char c = s.charAt(a);
				if(c != '-') {
					System.out.println("No");
					return;
				}else {
					
					String[] str = s.split("-");
					if(str.length==2) {
						String A = str[0];
						String B = str[1];
						for(int i=0; i<a; i++) {
							char t = A.charAt(i);
							int tmp = Integer.valueOf(t);
							if(tmp<48 || tmp>57) {
								System.out.println("No");
								return;
							}
						}
						for(int i=0; i<b; i++) {
							char t = B.charAt(i);
							int tmp = Integer.valueOf(t);
							if(tmp<48 || tmp>57) {
								System.out.println("No");
								return;
							}
						}
						System.out.println("Yes");
						return;
					}else {
						System.out.println("NO");
						return;
					}
				}
			}
		}
		*/
		
		
	/*	int n = sc.nextInt();
		if(n>=1 && n<=500) {
			int[] c = new int[n-1];
			int[] s = new int[n-1];
			int[] f = new int[n-1];
			for(int i=0; i<n-1; i++) {
				c[i] = sc.nextInt();
				s[i] = sc.nextInt();
				f[i] = sc.nextInt();
			}
			
			int[] r = new int[n];
			r[n-1] = 0;
			for(int i=0; i<n-1; i++) {
				int tmp = c[i] + s[i];
				for(int j=i+1; j<n-1; j++) {
					if(tmp>=s[j]) {
						tmp = tmp + c[j];
					}else {
						tmp = c[j] + s[j];
					}
				}
				r[i] = tmp;
				
			}
			for(int i=0; i<n; i++) {
				System.out.println(r[i]);
			}
		}*/
		
		
		int n = sc.nextInt();
		int[] l = new int[n];
		int[] r = new int[n];
		for(int i=0; i<n; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
		
			if(l[i]<=r[i]) {
				int count = 0;
				for(int j=l[i]; j<=r[i];) {
					if(isPrim(j)) {
						int tmp = (j+1)/2;
						if(isPrim(tmp)) {
							count ++;
						}
					}
					j = j+2;
				}
				System.out.println(count);
			}
			
		}
		
	
	}

	private static boolean isPrim(int j) {
		if(j<2) {
			return false;
		}
		if(j%2==0 && j>2) {
			return false;
		}
		int t = (int) Math.sqrt(j);
		if(t*t == j) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(j);i++) {
			if(j%i==0) {
				return false;
			}
		}
		return true;
	}
}
