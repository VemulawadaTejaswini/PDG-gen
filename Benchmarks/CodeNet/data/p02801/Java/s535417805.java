import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

		int i;
		for (i=0; i<25; i++) {
			if (alp[i].equals(str)){
				break;
			}
		}
		System.out.println(alp[i+1]);

	}
}