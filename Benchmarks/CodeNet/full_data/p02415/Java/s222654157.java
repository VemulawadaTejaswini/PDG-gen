import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.nextLine();
		char c[] = new char[s.length()];
		c = s.toCharArray();
		for(int i=0; i<s.length(); i++){
			if(Character.isLowerCase(c[i])){
				System.out.print(Character.toUpperCase(c[i]));
			} else if(Character.isUpperCase(c[i])){
				System.out.print(Character.toLowerCase(c[i]));
			} else {
				System.out.print(c[i]);
			}
		}		
	}
}