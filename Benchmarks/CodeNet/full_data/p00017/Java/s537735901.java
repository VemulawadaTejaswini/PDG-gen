
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.nextLine();
			char[] ab = str.toCharArray();
			int i;
			for(i = 1; i <= 26; i++) {
				String str2 = Caesar(ab,i);
				if((str2.indexOf("the ") != -1)
						|| (str2.indexOf("this ") != -1)
						|| (str2.indexOf("that ") != -1)) {
					System.out.println(str2);
				}
			}
		}
		scanner.close();
	}

	static String Caesar(char[] str, int key) {

		int i;
		String str2 = "";
		char tmp = 0;
		for(i = 0; i < str.length; ++i){
			if(97 <= str[i] && str[i] <= 122 ) {
				tmp = (char) ((char) ((char) ((str[i] % 97) + key) % 26) + 97);
			}else {
				tmp = str[i];
			}
			str2 = str2 + tmp;
		}
		return str2;
	}

}


