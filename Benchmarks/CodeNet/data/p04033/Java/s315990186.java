import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if(min <= 0 && max >= 0 || min == 0 || max == 0) {
			System.out.println("Zero");
		} else {
			if(min <= 0 && max <= 0) {
				System.out.println(((Math.abs(max - min))) % 2 == 0 ? "Negative" : "Positive");
			} else {
				System.out.println("Positive");
			}
		}
	}
}
