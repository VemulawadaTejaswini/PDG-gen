//java 11.0.1 2018-10-16 LTS

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		char c = s.toCharArray()[0];
		int i = (int)c;
		i++;
		
		System.out.println((char)i);
	}
}