import java.io.*;
import java.util.Scanner;

public class Main {
	public static int area (int a, int b) {
		return a * b;
	}

	public static int perimeter (int a, int b) {
		return (a + b) * 2;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = area(a, b);
        int peri = perimeter(a, b);
        System.out.println(area + " " + peri);
	}
}
