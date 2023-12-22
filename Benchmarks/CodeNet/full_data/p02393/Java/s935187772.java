import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> list = Arrays.asList(a, b,c);
		Collections.sort(list);
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
	}

}