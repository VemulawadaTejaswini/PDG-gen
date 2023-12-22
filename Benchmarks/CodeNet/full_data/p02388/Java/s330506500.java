import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(solution(x));
	}

	public static int solution (int x) {
		return x * x * x;
	}
}
