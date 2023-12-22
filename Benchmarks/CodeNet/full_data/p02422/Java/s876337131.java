import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int loop;
		int numA;
		int numB;

		String output = "";
		String line;
		String command;

		Scanner sc = null;



		try {
			sc = new Scanner(System.in);
			//?????????????????????????????\???????´?
			line = sc.nextLine();
			String[] word = line.split("");

			//???????????°???????????????
			loop = sc.nextInt();
			for (int i = 0; i < loop; i++) {
				command = sc.next();

				//???????????§??????
				switch (command) {

				//print
				case "print":
					numA = sc.nextInt();
					numB = sc.nextInt();

					for (int j = numA; j <= numB; j++) {
						output += word[j];
					}
					System.out.println(output);

					output = "";
					break;

				//reverse
				case "reverse":
					numA = sc.nextInt();
					numB = sc.nextInt();
					String s = "";
					int size = numB - numA;
					for (int j = 0; j <= size / 2; j++) {
						s = word[numB];
						word[numB] = word[numA];
						word[numA] = s;
						numA++;
						numB--;

					}
					break;

				//replace
				case "replace":
					numA = sc.nextInt();
					numB = sc.nextInt();
					line = sc.next();
					String[] list = line.split("");
					for (int k = 0; k < list.length; k++) {
						word[numA] = list[k];
						numA++;
					}
					break;
				default:
					break;
				}
			}


		} finally {
			sc.close();
		}
	}

}