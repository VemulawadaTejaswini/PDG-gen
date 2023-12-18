import java.util.Scanner;

class Lucky7{

	public static final String SEVEN = "7";
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int inputN = scan.nextInt();

		String numN = String.valueOf(inputN);
		String charN = null;
		for (int i=0; i < numN.length(); i++) {
			if (i != (numN.length() - 1)) {
				charN = numN.substring(i, i+1);
			} else {
				charN = numN.substring(i);
			}
			if (SEVEN.equals(charN)) {
				System.out.println("yes");
				return;
			}
		} 
		System.out.println("no");
		scan.close();
	}
}