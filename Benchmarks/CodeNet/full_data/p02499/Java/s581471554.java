
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphs[] = new int[256];
		char ch='.';
		while (true) {
			String line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				ch = Character.toLowerCase(line.charAt(i));
				alphs[ch]++;

			}
			if(ch=='.')
				break;


		}

		for(ch= 'a'; ch<= 'z'; ch++) {
			System.out.println(ch+ " : " + alphs[ch]);
		}
	sc.close();
	}

}