import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

            // 空白で分割してaとb,cを定義

            int a = scanner.nextInt();

            int b = scanner.nextInt();

            int c = scanner.nextInt();

            if (a < b && b < c) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
	}
}
