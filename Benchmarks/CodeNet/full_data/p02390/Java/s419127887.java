import java.io.*;
import java.util.Scanner;

public class Main {
	public static String watch(int s) {
		String res = "" + s / 3600;
		s = s % 3600;
		res = res + ":" + s / 60 + ":" + s % 60;
		return res;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(watch(s));
	}
}
