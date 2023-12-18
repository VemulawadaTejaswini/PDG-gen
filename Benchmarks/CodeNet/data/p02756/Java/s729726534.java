import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s = stdIn.next();
		int q = stdIn.nextInt();
		String a="";
		
		for(int i = 0; i < q; i++) {
			int t = stdIn.nextInt();
			
			if(t==1) {
				for(int j = s.length()-1; j >= 0; j--) {
					a+= s.charAt(j);
				}
				s = a;
				a = "";
			}else {
				int f = stdIn.nextInt();
				String c = stdIn.next();
				
				if(f==1) {
					s = c + s.substring(0,s.length());
				}else {
					s = s.substring(0,s.length()) + c;
				}
				
				
			}
			
			
			
			
		}

		System.out.println(s);

	}

}
