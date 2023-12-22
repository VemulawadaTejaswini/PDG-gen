
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){

	eliminateDuplicates(new String[]{});
	}

	private static void eliminateDuplicates(String[] strings) {
		Set<String> lottery = new LinkedHashSet<String>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for(int i = 0; i < N; i++){
			String S = scan.nextLine();
			lottery.add(S);
		}

		Object[] kindsoflottery = lottery.toArray();

		System.out.println(Arrays.toString(kindsoflottery));
		System.out.println(kindsoflottery.length);
	}
}