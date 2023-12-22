import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		for(int i = 0; i < str.length(); i++){
			Character ch = new Character(str.charAt(i));
			if(Character.isUpperCase(ch)){
				str = str.substring(0, i) + Character.toLowerCase(ch) + str.substring(i+1);
			}else if(Character.isLowerCase(ch)){
				str = str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i+1);
			}
		}
		System.out.println(str);
	}
}