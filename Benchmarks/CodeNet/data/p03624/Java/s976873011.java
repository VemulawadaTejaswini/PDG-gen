import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<String> set = new HashSet<>();

		String ans = "None";

			

			char c = 'a';

			for(int j = 0; j < 26; j++) {
				if(s.contains(String.valueOf(c))) {
					c++;
					continue;
				}
				System.out.println(c);
				break;

			}	
			System.out.println(ans);
	}
	}



