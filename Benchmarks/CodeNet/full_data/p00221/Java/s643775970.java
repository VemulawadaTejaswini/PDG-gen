import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);

		while(true) {
			int m = scan.nextInt();
			int n = scan.nextInt();

			if(m == 0 || n == 0) {
				break;
			}

			List<Integer> li = new ArrayList<Integer>();
			for(int i = 1;i <= m ; i++) { li.add(i); }

			int cursor = 0;
			String ansS,judgeS;

			for(int i = 1 ; i <= n;i++) {
				judgeS = "";
				ansS = scan.next();

				if(li.size() == 1) {continue;}
				if(i % 3 == 0) {judgeS += "Fizz";}
				if(i % 5 == 0) {judgeS += "Buzz";}
				if(judgeS.equals("") == true) {judgeS = Integer.toString(i);}

				if(judgeS.equals(ansS) == false) {
					li.remove(cursor--);
				}

				if(++cursor >= li.size()) {cursor = 0;}
			}

			for(Integer a : li) {
				System.out.print(Integer.toString(a));
				if(!a.equals(li.get(li.size() - 1))) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
