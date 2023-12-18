import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 3 || i == 5 || i == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
