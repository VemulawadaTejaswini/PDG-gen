import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 空白で分割してaとbを定義

        int a = scanner.nextInt();

        int b = scanner.nextInt();

    		System.out.println(a * b + " " + 2 * (a + b));
	}
}
