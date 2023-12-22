import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner n = new Scanner(System.in);

		String S = n.next();
		String T = n.next();

		String[] S_list = S.split("");
		String[] T_list = T.split("");


		int count = 0;
		for(int i=0;i<S.length();i++) {
			if(S_list[i].equals(T_list[i])) {

			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}
