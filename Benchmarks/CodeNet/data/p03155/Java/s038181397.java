import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		for(int a = 0 ; a < 3 ;a++){
			input.add(Integer.parseInt(sc.next()));
		}
		System.out.println((input.get(0) - input.get(1) + 1) * (input.get(0) - input.get(2) + 1));
	}
}
