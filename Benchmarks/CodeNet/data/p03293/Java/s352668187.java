import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		String t = stdIn.next();
		
		boolean flag = false;
		
		for(int i = 0; i < s.length(); i++) {
			s = s.substring(i,s.length())+s.substring(0,i);
			if(s.equals(t)){
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
