import java.util.Scanner;

class Main {

	public static void main(String[] args) {

	char[] inputline;
	Scanner stdIn = new Scanner(System.in);

	inputline =  stdIn.nextLine().toCharArray();

	for(int i = 0; i < inputline.length; i++) {
		if(Character.isLowerCase(inputline[i])) {
			inputline[i] = Character.toUpperCase(inputline[i]);
		} else {
			inputline[i] = Character.toLowerCase(inputline[i]);
		}
	}

	System.out.println(inputline);

	stdIn.close();
	}
}