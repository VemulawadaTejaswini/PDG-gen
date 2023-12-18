import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char[] cs = string.toCharArray();
		int count = 0;
		for(int i = 0;i < string.length();i++){
			if(cs[i] == '0'){
				count++;
			}
		}
		
		System.out.println(count);

	}
}

