import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		int check=0;
		if(a.length()>b.length())check=1;
		else if(a.length()<b.length())check=2;
		else {
			for(int i=0;i<a.length();i++) {
				int anum=Character.getNumericValue(a.charAt(i));
				int bnum=Character.getNumericValue(a.charAt(i));
				if(anum!=bnum) {
					if(anum>bnum)check=1;
					else check=2;
					break;
				}
			}
		}
		if(check==0)System.out.println("EQUAL");
		else System.out.println((check==1)? "GREATER":"LESS");
	}
}