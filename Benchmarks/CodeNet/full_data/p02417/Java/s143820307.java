import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] alpha_int = new int[26];
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int length1 = 0;
		int length2 = 0;
		
		while (true) {
			String s = sc.nextLine();
			list.add(s);
			
			if (s.contains(".")) {
				break;
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			s = s.toLowerCase();
			length1 = s.length();
			for (int j = 0; j < 26; j++) {
				s = s.replaceAll(alpha[j],"");
				length2 = s.length();
				alpha_int[j] += length1 - length2;
				s = list.get(i);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(alpha[i]);
			System.out.print(" : ");
			System.out.println(alpha_int[i]);
		}
	}

}