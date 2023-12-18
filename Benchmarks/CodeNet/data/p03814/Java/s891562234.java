import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int currentHighestLength = 0;
		int counter = 0;
		
		while (counter < str.length()) {
			int testLength = 1;
			int currentHighestTestLength = 0;
			if (str.charAt(counter) == 'A') {
				while (counter + testLength < str.length()) {
					if (str.charAt(counter + testLength) == 'Z') {
						currentHighestTestLength = testLength + 1;
						testLength++;
					} else {
						testLength++;
					}
				}
				counter++;
			} else {
				counter++;
			}
			if (currentHighestTestLength > currentHighestLength) {
				currentHighestLength = currentHighestTestLength;
			} else {
			}
		}
		System.out.println(currentHighestLength);
	}

}
