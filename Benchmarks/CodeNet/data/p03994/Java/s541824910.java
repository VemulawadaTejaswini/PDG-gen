import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class Main {
	static Scanner in;
	static char s[];
	static long k;
	public static void main(String[] args) throws FileNotFoundException {
//		in = new Scanner(new File("input.txt"));
		in = new Scanner(System.in);
		s = in.next().toCharArray();
		k = in.nextLong();
		for(int i = 0;i < s.length;i++){
			if(s[i] == 'a') continue;
			int diff = 'z' + 1 - s[i];
			if(k < diff) continue;
			s[i] = 'a';
			k -= diff;
		}
		if(k > 0){
			int diff = 'z' - s[s.length - 1];
			k = k%26;
			if(k > diff) s[s.length - 1] = (char) ('a' + k - diff - 1);
			else s[s.length - 1] = (char) (s[s.length - 1] + k);
		}
		for(int i = 0;i < s.length;i++) System.out.print(s[i]);
	}
}