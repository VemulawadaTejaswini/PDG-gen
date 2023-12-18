import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String inputE = sc.next();
		String inputO = sc.next();
		String[] inputESplit = inputE.split("");
		String[] inputOSplit = inputO.split("");
		boolean flg = false;
		int j = 0;
		int k = 0;
		for (int i = 0; i < inputESplit.length + inputOSplit.length; i++) {
			if (!flg) {
				System.out.print(inputESplit[j]);
				j++;
				flg = !flg;
			} else {
				System.out.print(inputOSplit[k]);
				k++;
				flg = !flg;
			}
		}
	}
}
