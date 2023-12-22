import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);

		int K = n.nextInt();
		String S = n.next();

		if(S.length() <= K) {
			System.out.println(S);

		}else {
			String[] strArray = S.split("");
				for(int i=0 ; i<K ; i++) {
					System.out.print(strArray[i]);
				}
			System.out.println("...");
		}
	}
}
