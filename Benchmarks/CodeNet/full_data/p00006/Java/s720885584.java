import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
			System.out.print(ch[ch.length - 1 - i]);
		}
	}
}