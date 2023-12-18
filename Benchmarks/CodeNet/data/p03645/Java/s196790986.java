import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int a;
		int b;
		ArrayList<Integer> aryFirstTo = new ArrayList<Integer>();
		ArrayList<Integer> arySecondFrom = new ArrayList<Integer>();
		boolean possible = false;
		for (int i=0; i<M; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 1){
				aryFirstTo.add(b);
			} else if (b == N){
				arySecondFrom.add(a);
			}
		}
		for (int i=0; i < aryFirstTo.size(); i++){
			int firstTo = aryFirstTo.get(i);
			for (int j=0; j < arySecondFrom.size(); j++){
				int secondFrom = arySecondFrom.get(j);
				if (firstTo == secondFrom){
					possible = true;
					break;
				}
			}
		}

		if (possible == true){
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
