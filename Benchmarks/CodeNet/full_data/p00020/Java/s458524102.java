import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		String pass = scan.nextLine();
		for(int i = 0; i < pass.length(); i++){
			char ch = pass.charAt(i);
			if((int)ch >= 96) ch -= 32;
			System.out.print(ch);
		}
	}
}