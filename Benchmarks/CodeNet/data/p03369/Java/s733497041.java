
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int n=700;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='o' &&(s.charAt(i+1)=='x')) {
				System.out.println(n+100*2);
				break;
			}
			else if(s.charAt(i)=='o') {
				System.out.println(n+3*100);
				break;
			}
			else if(s.charAt(i)=='x') {
				System.out.println(n);
				break;
			}
		}

	}

}