import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
       		InputStreamReader is = new InputStreamReader(System.in);
        	BufferedReader br = new BufferedReader(is);
		String target = br.readLine();

		if (target.length() < 5) {
			System.out.println("NO");
			return;
		}

		while (!("YES".equals(target)) && !("NO".equals(target)) ) {
			target = stringJudge(target);
		}

		System.out.println(target);

	}

	private static String stringJudge(String target) {
		String REV_DREAM = "dream";
		String REV_DREAMER = "dreamer";
		String REV_ERASE = "erase";
		String REV_ERASER = "eraser";
		String YES = "YES";
		String NO = "NO";

		int target_length = target.length();

		if (target_length <= 7) {
			if ( (target.indexOf(REV_DREAM) == 0) || (target.indexOf(REV_DREAMER) == 0) ||
				(target.indexOf(REV_ERASE) == 0) || (target.indexOf(REV_ERASER) == 0) ) {
				return YES;
			} else {
				return NO;
			}
		}

		if (target.lastIndexOf(REV_DREAMER) == target_length - 7) {
			return target.substring(0, target_length - 7);
		} else if (target.lastIndexOf(REV_ERASER) == target_length - 6) {
			return target.substring(0, target_length - 6);
		} else if ( (target.lastIndexOf(REV_DREAM) == target_length - 5) || (target.lastIndexOf(REV_ERASE) == target_length - 5) ) {
			return target.substring(0, target_length - 5);
		} else {
			return NO;
		}
	}

}