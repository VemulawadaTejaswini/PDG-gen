import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long h = scan.nextLong();
		long w = scan.nextLong();
		
		if(w % 2 == 0) {
			System.out.println(h * w / 2);
		} else {
			System.out.println((h * (w - 1) / 2) + (h + 1) / 2);
		}
	}
}
