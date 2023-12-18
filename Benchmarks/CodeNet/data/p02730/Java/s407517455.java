
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int strlength = str.length();

		String str1 = str.substring(0, (strlength-1)/2);
		String str2 = str.substring((strlength-1)/2 +1,strlength);
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2)) {
			for(int i =0; i<str1.length(); i++) {
				char a = str1.charAt(i);
				char b =str2.charAt(str1.length()-1-i);
				System.out.println("=="+i+"=="+a+","+b);
				if(a!=b) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
			return;
		}else {
			System.out.println("No");
		}
	}
		
}
