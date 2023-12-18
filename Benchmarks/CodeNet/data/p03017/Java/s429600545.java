import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			char[] s = sc.next().toCharArray();
			
			if(c<d) {
				for(int i=a;i<d-1;i++) {
					if(s[i]=='#'&&s[i+1]=='#') {
						System.out.println("No");
						return;
					}
				}
				System.out.println("Yes");
			}else {
				boolean flg = false;
				for(int i=a;i<d-1;i++) {
					if(s[i]=='#'&&s[i+1]=='#') {
						System.out.println("No");
						return;
					}
				}
				for(int i=b;i<c-2;i++) {
					if(s[i]=='.'&&s[i+1]=='.'&&s[i+2]=='.'){
						flg = true;
					}
				}
				if(flg) {
					System.out.println("Yes");
					return;
				}
				System.out.println("No");
			}
			
		}
		
	}
