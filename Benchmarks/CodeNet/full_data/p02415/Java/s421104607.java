import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		int i;
		while(true){
			s=sc.next();
			for(i=0;i<s.length();i++){
				c=s.charAt(i);
				if(Character.isLowerCase(c))System.out.print(Character.toUpperCase(c));
				else if(Character.isUpperCase(c))System.out.print(Character.toLowerCase(c));
				else System.out.print(c);
			}
			if(s.charAt(s.length()-1)=='.')break;
			System.out.print(" ");
		}
		System.out.print("\n");
	}
}

