import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int num = s.length();
		char[] fh = s.substring(0,  num/2).toCharArray();
		char[] sh = s.substring(num/2,  num).toCharArray();
		List<Character> lfh = new ArrayList<Character>();
		List<Character> lsh = new ArrayList<Character>();
		for(int m = 0; m < fh.length; m++) lfh.add(fh[m]);
		for(int n = 0; n < sh.length; n++) lsh.add(sh[n]);
		List<Character> lfh2 = new ArrayList<Character>(new HashSet<>(lfh));
		List<Character> lsh2 = new ArrayList<Character>(new HashSet<>(lsh));

		for(int i = 0; i < lfh2.size(); i++) {
			for(int j = 0; j < lsh2.size(); j++) {
				if(lfh2.get(i) == lsh2.get(j)) cnt++;
			}
		}
		System.out.println(cnt);
	}
}