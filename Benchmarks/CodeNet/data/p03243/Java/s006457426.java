

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		int iNum = Integer.parseInt(num);
		ArrayList<Integer> out = new ArrayList<>();
		
        for (int i = 0; i < num.length() ; i++) {
        	String c = String.valueOf(num.charAt(i));
        	int n = Integer.parseInt(c+c+c);
        	out.add(n);
        }
		Collections.sort(out);
		for(int a : out) {
			if(a >= iNum) {
				System.out.println(a);
				break;
			}
		}
	}


}
