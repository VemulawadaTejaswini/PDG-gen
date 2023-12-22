import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		
		String str = cin.next();
		reverse(str);
		
	}
	
	private static void reverse(String str){
		int len = str.length();
		for (int i = 0; i < len; i++){
			System.out.print(str.charAt(len - i - 1));
		}
		System.out.println();
	}
}