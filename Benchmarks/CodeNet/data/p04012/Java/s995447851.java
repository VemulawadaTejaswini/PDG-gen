import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String[] strStdIn = new String[1];
		int i = 0;
		while (i != 1) {
			strStdIn[i] = scanner.nextLine();
			i++;
		}

		String target = strStdIn[0];

		Main e = new Main();

		boolean judge = e.search(target);
		
		if (judge) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
    	}

	private boolean search(String target) {

		String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for (int i=0; i < 26; i++) {
			int count = 0;
			int s = 0;
			int index = 0;
			while (index != -1) {
        			index = target.indexOf(alphabet[i], s);
				s = (index + alphabet[i].length());
       				if (index != -1) {
					count++;
				}
    			}
			if (count % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}