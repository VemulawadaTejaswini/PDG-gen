import java.util.Scanner;

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		char ch;
		s = sc.nextLine();
		for(int i=0;i<s.length();i++){
			ch = s.charAt(i);
			if((int)ch>=(int)'a'&&(int)ch<=(int)'z'){
				ch+='A'-'a';
			}
			else if((int)ch>=(int)'A'&&(int)ch<=(int)'Z'){
				ch+='a'-'A';
			}
			System.out.print(ch);
		}
		System.out.println();
		sc.close();
	}
}
