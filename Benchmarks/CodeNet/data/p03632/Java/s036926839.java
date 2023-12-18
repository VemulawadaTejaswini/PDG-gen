import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();

		if (two > three) {
			System.out.println(two - three);
		} else {
			System.out.println(0);
		}
	}
}