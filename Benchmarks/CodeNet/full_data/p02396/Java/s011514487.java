import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;

		Scanner stdIn = new Scanner(System.in);

		for(int i = 1; stdIn.hasNext(); i++) {
			if(!(stdIn.hasNextInt(0))) {
				break;
			}
			System.out.println("case " + i + stdIn.nextInt());
		}
	}

}