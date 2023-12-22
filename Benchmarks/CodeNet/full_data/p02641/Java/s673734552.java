
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] nums = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int con = 0;
		while (true) {
			int[] target = new int[]{line[0] - con,line[0] + con};
			if (Arrays.asList(nums).contains(target[0]) == false) {
				System.out.println(target[0]);
				break;
			}
			if (Arrays.asList(nums).contains(target[1]) == false) {
				System.out.println(target[1]);
				break;
			}
			con++;
		}
	}


}
