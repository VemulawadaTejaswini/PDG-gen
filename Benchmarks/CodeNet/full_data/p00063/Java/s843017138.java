import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(isPalindrome(line)) count++;
		}
		sc.close();
		System.out.println(count);
	}
	
	static boolean isPalindrome(String str) {
		for(int i = 0; i < str.length() / 2 + 1; i++) {
			if(str.codePointAt(i) != str.codePointAt(str.length() - i - 1)) return false;
		}
		return true;
	}
}