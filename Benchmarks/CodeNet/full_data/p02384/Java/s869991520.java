import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dice = br.readLine().split(" ");
		List<Integer> surface1 = Arrays.<Integer>asList(2, 3, 5, 4, 2);
		List<Integer> surface2 = Arrays.<Integer>asList(6, 3, 1, 4, 6);
		List<Integer> surface3 = Arrays.<Integer>asList(2, 6, 5, 1, 2);
		List<Integer> surface4 = Arrays.<Integer>asList(2, 1, 5, 6, 2);
		List<Integer> surface5 = Arrays.<Integer>asList(1, 3, 6, 4, 1);
		List<Integer> surface6 = Arrays.<Integer>asList(5, 3, 2, 4, 5);
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] input = br.readLine().split(" ");
			switch (input[0]) {
			case "1":
				System.out.println(dice[surface1.get(surface1.indexOf(Integer.parseInt(input[1])) + 1) - 1]);
				break;
			case "2":
				System.out.println(dice[surface2.get(surface2.indexOf(Integer.parseInt(input[1])) + 1) - 1]);
				break;
			case "3":
				System.out.println(dice[surface3.get(surface3.indexOf(Integer.parseInt(input[1])) + 1) - 1]);
				break;
			case "4":
				System.out.println(dice[surface4.get(surface4.indexOf(Integer.parseInt(input[1])) + 1) - 1]);
				break;
			case "5":
				System.out.println(dice[surface5.get(surface5.indexOf(Integer.parseInt(input[1])) + 1) - 1]);
				break;
			case "6":
				System.out.println(dice[surface6.get(surface6.indexOf(Integer.parseInt(input[1])) + 1) - 1]);
				break;
			}
		}
	}
}