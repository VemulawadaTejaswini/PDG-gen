import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = Integer.parseInt(stdIn.nextLine());
		String[] S = new String[N];
		for(int i = 0; i < N; i ++) {
			S[i] = stdIn.nextLine();
		}
		ArrayList<String> item = new ArrayList<String>();
		boolean canGet = true;
		for(int i = 0; i < S.length; i ++) {
			canGet = true;
			for(int j = 0; j < item.size(); j ++) {
				if(S[i].compareTo(item.get(j)) == 0) {
					canGet = false;
					break;
				}
			}
			if(canGet) {
				item.add(S[i]);
			}
		}
		System.out.println(item.size());
	}

}