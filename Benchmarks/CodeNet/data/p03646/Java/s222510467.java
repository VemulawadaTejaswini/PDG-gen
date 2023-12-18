import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong(), y = K / 2;
		System.out.print(2 + "\n" + y + " ");
		System.out.println(K % 2 == 0 ? y + 1 : y + 2);
	}

}