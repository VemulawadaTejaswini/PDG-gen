import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		int min1 = 0;
		int min2 = 0;
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String str1 = new String(s);
		String str2 = new String(s);
		if(s.indexOf("W") == -1 || s.indexOf("B") == -1) {
			System.out.print(0);
		}
		else {
			while(str1.indexOf("W") != -1 && str1.indexOf("B") != -1) {
				if(str1.charAt(0) == 'W') {
					int num = 1;
					String let = "";
					while(str1.charAt(num) == 'W') {
						num++;
						let = "B" + let;
					}
					str1 = "B" + let + str1.substring(num);
					min1++;
				}else {
					int num = 1;
					String let = "";
					while(str1.charAt(num) == 'B') {
						num++;
						let += "W";
					}
					str1 = "W" + let + str1.substring(num);
					min1++;
				}
			}
			while(str2.indexOf("W") != -1 && str2.indexOf("B") != -1) {
				if(str2.charAt(str2.length()-1) == 'W') {
					int num = str2.length()-2;
					String let = "";
					while(str2.charAt(num) == 'W') {
						num--;
						let = "B" + let;
					}
					str2 = str2.substring(0, num) + let + "B";
					min2++;
				}else {
					int num = str2.length()-2;
					String let = "";
					while(str2.charAt(num) == 'B') {
						num--;
						let = "W" + let;
					}
					str2 = str2.substring(0, num) + let + "W";
					min2++;
				}
			}
			if(min1 < min2) {
				System.out.println(min1);
			} else {
				System.out.println(min2);
			}
		}
	}
}


