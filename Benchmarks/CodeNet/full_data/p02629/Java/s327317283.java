import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			long n = sc.nextLong();
			
			char[] s = Long.toString(n, 26).toCharArray();
			
			int[] num = new int[s.length];
			char[] ret = new char[s.length];
			
			num[0]=s[0];
			
			for(int i=0;i<s.length;i++) {
				num[i] = (int)s[i];
				if(49<=num[i]&&num[i]<=57) {
					num[i] = num[i]+48;
					ret[i] = (char)(num[i]);
				}else {
					num[i] = num[i]+9;
					ret[i] = (char)(num[i]);
				}}
			
			
			for(int i=0;i<s.length;i++) {
				System.out.print(ret[i]);
			}

		}
	}
