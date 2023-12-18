import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[] n = scanner.nextLine().toCharArray();

		int max = 0;

		for(char e : n) {



			max = Math.max(max, e - 48);
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n.length; i++) {

			sb.append(max);
		}

		System.out.println(sb.toString());
	}

}
