import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> sumWE = new ArrayList<Integer>();
		int a = sc.nextInt();
		int sum = a;
		int countE = 0;
		int countW = 0;
		String line = sc.next();
		String[] param = line.split("");
		for (int j = 0; j < a; j++) {
			for (int k = 0; k < a; k++) {
				if (k > j && param[k].equals("E")) {
					countE++;
				}else if (k < j && param[k].equals("W")) {
					countW++;
				}
			}
			sumWE.add(countE + countW);
			countE = 0;
			countW = 0;
		}
		Collections.sort(sumWE);
		System.out.println(sumWE.get(0));
	}
}