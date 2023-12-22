import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[2];
		num[0] = scn.nextInt();
		num[1] = scn.nextInt();
		Arrays.sort(num);
		System.out.println(num[0] +" "+ num[1]);
	}
}

