import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			int n = s.length;
			int ret = 0;
			
			for(int i=0;i<n;i++) {
				String NUM =String.valueOf(s[i]);
				for(int j=i+1;j<n;j++) {
					NUM+=s[j];
					long num = Long.parseLong(NUM);
					if(num%2019==0) {
						ret++;
					}
				}
				
			}
			
			
			System.out.println(ret);
			
	    }
				
	}
