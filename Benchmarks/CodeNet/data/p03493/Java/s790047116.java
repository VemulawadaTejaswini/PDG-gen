import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==1) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
