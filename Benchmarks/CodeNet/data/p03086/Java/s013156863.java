
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char  s[] = sc.nextLine().toCharArray();
		int max = 0;
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			switch (s[i])  {

			case 'A':
			case 'G':
			case 'C':
			case 'T':
				count++;
				break;
			default : 
				max = max < count ? count : max;
				count = 0;
				break;
			}
				
		}
		System.out.println(max);
		
		/*int N = sc.nextInt();
		int Q = sc.nextInt();
		String str = sc.nextLine();
		 str = sc.nextLine();

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
		*/
	}
}