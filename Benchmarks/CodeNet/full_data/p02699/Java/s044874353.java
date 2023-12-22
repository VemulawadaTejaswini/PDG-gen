import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int sheep = Integer.parseInt(array[0]);
		int wolves = Integer.parseInt(array[1]);
		String result = sheep <= wolves ? "unsafe" : "safe";
	    System.out.println(result);
	}
}
