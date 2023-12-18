import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			String s = sc.next();
			char[] cs = s.toCharArray();
			
			int res = 0;
			
			for(int i=0;i<n-2;i++) {
				if(cs[i]=='A'&&cs[i+1]=='B'&&cs[i+2]=='C') {
					res++;
				}
			}
			
			System.out.println(res);
			
		}

	}
	

	