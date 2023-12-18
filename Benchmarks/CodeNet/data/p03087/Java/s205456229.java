
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String str = sc2.next();
		
		String msg = "";
		int stArr[] = new int[Q];
		int endArr[] = new int[Q];

		 Scanner sc3 = new Scanner(System.in);
		for (int i = 0; i < Q; i++) {
			stArr[i] = sc3.nextInt();
			endArr[i] = sc3.nextInt();
		}
		
		for (int i = 0; i < Q; i++) {
			String s = str.substring(stArr[i] - 1, endArr[i] - 1);
			int count = 0;
			for (int j = 0; j< s.length() - 1; j++) {
				if (s.substring(j, j + 1) == "AC") {
					count++;
				}
			}
			System.out.println(count);
		}

		
	}
}