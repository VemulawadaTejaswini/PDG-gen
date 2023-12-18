import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}
	
	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		
		Set<Integer> set = new HashSet<Integer>(num);
		
		System.out.println(set.size());	
	}
}