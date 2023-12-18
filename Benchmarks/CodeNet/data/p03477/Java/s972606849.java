import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		a+=sc.nextInt();
		int b = sc.nextInt();
		b+=sc.nextInt();
		sc.close();

		if (a != b) {
			System.out.println(a>b ? "Left" : "Right");
		} else {
			System.out.println("Balanced");
		}
	}
}
