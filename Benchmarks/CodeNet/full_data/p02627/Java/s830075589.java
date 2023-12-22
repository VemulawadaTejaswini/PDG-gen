package comp;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		char output = 'a';

		Scanner sc = new Scanner(System.in);

		output = (char)sc.nextByte();

		if(Character.isUpperCase(output)){
			output = 'A';
		}
		
		System.out.println(output);
	}
}
