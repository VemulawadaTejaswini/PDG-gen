

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		int iNum = Integer.parseInt(num);
		ArrayList<String> out = new ArrayList<>();
		
        for (int i = 0; i < num.length() ; i++) {
        	String c = String.valueOf(num.charAt(i));
        	out.add(c+c+c);
        }
		Collections.sort(out);
		for(String a : out) {
			if(Integer.parseInt(a) >= iNum) {
				System.out.println(a);
				break;
			}
		}
	}


}
