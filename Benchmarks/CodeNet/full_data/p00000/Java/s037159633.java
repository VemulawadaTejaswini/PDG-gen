import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0000
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + j * i);
			}
		}
	}
}