import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		char[] alf = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] count = new int[26];
		
		StringBuilder str_kari = new StringBuilder();
		while(scan.hasNextLine()) {
			str_kari.append(scan.nextLine());
		}

		String str = str_kari.toString();
		for(int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			// not alfabet
			if(!Character.isLetter(temp)) {
				// nothing
			}
			else {
				// 大文字なら小文字へ
				if(Character.isUpperCase(temp)) {
					temp = Character.toLowerCase(temp);
				}
				for(int j = 0; j < 26; j++) {
					if(temp == alf[j]) count[j]++;
				}
				
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println(alf[i] + " : " + count[i]);
		}
			
		
		
	}

}

