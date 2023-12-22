import java.io.*;
import java.util.Scanner;

public class Main {
	public static int solution (int x) {
		return x * x * x;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(solution(x));
	}
}
