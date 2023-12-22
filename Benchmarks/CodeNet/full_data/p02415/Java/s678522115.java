import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		try{
			Scanner stdIn = new Scanner(System.in);
			
			String s = stdIn.nextLine();
			
			int l = s.length();
			for(int i = 0;i < l;i++){
				if(Character.isUpperCase(s.charAt(i))){
					char a = s.charAt(i);
					a = Character.toLowerCase(a);
					System.out.print(a);
				}
				else {
					char a = s.charAt(i);
					a = Character.toUpperCase(a);
					System.out.print(a);
				}
			}
			System.out.println();
		} catch(Exception e){
		}
	}
}
			