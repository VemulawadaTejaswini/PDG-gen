import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int total = 0;
		int products = sc.nextInt();
		int popular = sc.nextInt();
		double comparison = 0;
		boolean pass = true;
		ArrayList<Integer> votenum = new ArrayList<Integer>();

		for(int i = 0; i < products; i++) {
			int vote = sc.nextInt();
			votenum.add(i, vote);
			total += vote;
		}

		Collections.sort(votenum, Collections.reverseOrder());
		comparison = total / (4 * popular);

		for(int i = 0; i < popular;  i++) {
			 if(votenum.get(i)  < comparison) {
				 pass = false;
				 break;
			 }
		}
		if(pass == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}