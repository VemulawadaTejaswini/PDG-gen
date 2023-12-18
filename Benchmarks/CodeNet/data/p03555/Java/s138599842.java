import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first = scan.next();
		String second = scan.next();

		char[] f = first.toCharArray();
		char[] s = second.toCharArray();
		if(f[1]==s[1]){
			if(f[0] == s[2] && f[2] == s[0]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}}else{
				System.out.println("NO");
			}

	}
