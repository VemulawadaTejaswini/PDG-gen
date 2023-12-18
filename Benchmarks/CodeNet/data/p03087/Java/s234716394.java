import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputNQ = scanner.nextLine();
		String[] listInputNQ = inputNQ.split(" ");		
		String inputS = scanner.nextLine();
		
		for (int i = 0; i < Integer.parseInt(listInputNQ[1]); i++) {
			String tmpInput = scanner.nextLine();
			String[] tmpQ =  tmpInput.split(" ");
			int[] q = new int [] {Integer.parseInt(tmpQ[0]) , Integer.parseInt(tmpQ[1])};
			String beforeReplaceS = inputS.substring(q[0]-1,q[1]);
			char beforeC = ' ';
			int count = 0;
			for(char c : beforeReplaceS.toCharArray()) {
				if (beforeC == 'A' && c == 'C') {
					count ++;
				}
				beforeC = c;
			}
			System.out.println(count);
		}
		scanner.close();
	}
}
