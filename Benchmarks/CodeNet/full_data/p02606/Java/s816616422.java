import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(r/d - (l-1)/d);
	}
}
