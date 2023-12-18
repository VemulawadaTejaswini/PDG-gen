package atCoder;

import java.util.*;
 
class stringParser{
	public  StringBuilder str;
	public static void main (String[] args) throws java.lang.Exception{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string: ");
		stringParser sp = new stringParser();
		sp.str = new StringBuilder(reader.nextLine());
		sp.removeLetters();
		sp.checkCond();
		System.out.println(sp.str.length());
	}
	
	public  void checkCond(){
		int initLen = str.length();
		removeLetters();
		if(str.length()!=initLen){
			checkCond();
		}
		return;
	}
	
	public  void removeLetters(){
		for(int i=0; i<str.length()-1; i++){
			if(str.charAt(i)=='S'&&str.charAt(i+1)=='T') str = str.delete(i, i+2);
		}
	}
}