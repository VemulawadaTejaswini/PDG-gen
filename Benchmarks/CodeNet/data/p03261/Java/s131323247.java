import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> slist = new ArrayList<String>();
		String beforeWord = null;
		String word = null;
		boolean flag = true;
		int size = sc.nextInt();
		if(size > 100){
			flag = false;
			System.out.println("No");
			return;
		}
		word = sc.nextLine();

		for (int i = 0; i < size; i++) {
			word = sc.nextLine();
			if (beforeWord != null) {
				char shiri = beforeWord.charAt(beforeWord.length() - 1);
				char atama = word.charAt(0);
				if (shiri == atama) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

			if (!slist.contains(word)) {
				if (flag) {
					slist.add(word);
					beforeWord = word;
				}
			}else{
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}