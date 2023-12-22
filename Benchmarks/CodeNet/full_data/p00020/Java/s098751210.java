

import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception{
	
	Scanner sc=new Scanner(System.in);
	String text=sc.nextLine();
	StringBuilder st=new StringBuilder();
	for(int i=0;i<text.length();i++) {
		if(Character.isLetter(text.charAt(i)))
		st.append(Character.toUpperCase(text.charAt(i)));
		else if(Character.isSpace(text.charAt(i)))
		st.append(" ");
		else
		st.append(text.charAt(i));
	}
	System.out.println(st.toString());
}
}