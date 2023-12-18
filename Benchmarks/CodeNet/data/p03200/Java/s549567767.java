import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			
			String[] a = new String[s.length()];
			
			for(int i =0;i<s.length();i++) {
				a[i]=String.valueOf(s.charAt(i));
				
			}
			
			int res = 0;
			
			for(int i = 0;i<s.length()-1;i++) {
				if(i==s.length()) {
					res++;
					break;
				}
				if(a[i].equals("B")) {
					if(a[i+1].equals("W")) {
						a[i]="W";
						a[i+1]="B";
						res ++;
						i = 0;
						
					}
				
				}
			}
			System.out.println(res+1);
			
		}

	}