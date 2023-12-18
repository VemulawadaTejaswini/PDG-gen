
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int check=0;
		int a=0,z=0;
		for(int i=0;i<s.length();i++) {
			if(check>=1)check++;
			if(check==0&&s.charAt(i)=='A') {
				a=i;
				check=1;
			}
			else if(check>=1&&s.charAt(i)=='Z')z=i;
		}
		System.out.println(z-a+1);

	}
}
