import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			int q = sc.nextInt();
			for(int i=0;i<q;i++) {
				int t=sc.nextInt();
				if(t==1) {
					StringBuffer str = new StringBuffer(s);
					s = str.reverse().toString();
				}else {
					int f = sc.nextInt();
					String c =sc.next();
					if(f==2) {
						s = s.concat(c);
						
					}else {
						s=c.concat(s);
					}
				}
			}
			
			System.out.println(s);
			
		}

	}