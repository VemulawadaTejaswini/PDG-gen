import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String Sd = scan.next();
			String T = scan.next();
			char[]s = new char[Sd.length()];
			char[]t = new char[T.length()];
			s = Sd.toCharArray();
			t = T.toCharArray();
			
			for(int i = s.length-t.length;i>=0;i--) {
				int count = 0;
				for(int j = 0;j<t.length;j++) {
					if(t[j]==s[i+j]||s[i+j]=='?')count++;
					
					
					
				}
				if(count==t.length) {
					Sd = Sd.substring(0, i)+T;
					Sd = Sd.replace('?','a');
					
					System.out.println(Sd);
					System.exit(0);
				}
			}
			
			System.out.println("UNRESTORABLE");
			
			
			
		}
		
		
	}
		

}
