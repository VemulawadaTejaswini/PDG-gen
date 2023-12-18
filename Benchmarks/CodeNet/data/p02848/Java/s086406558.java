import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
		n = stdIn.nextInt();
		}while(n<0||n>26);
		String S;
		do {
		S = stdIn.next();
		}while(S.length()<1||S.length()>10000);
		int len = S.length();
		String s[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=1 ; i<=len ; i++ ) {
			for(int j=0 ; j<26 ; j++)
				if(s[j].equals(S.substring(i-1,i))) {
					System.out.print(s[(j+n)%26]);
				}
		}
	}
}
