import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ",0);
		sc.close();
		System.out.println(str[1] + str[0]);
	}
}