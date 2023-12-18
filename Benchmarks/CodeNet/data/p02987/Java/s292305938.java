import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int[] q = new int[26];
		for(char c: s) q[c-'A']++;
		for(int k: q){
			if(k == 2 || k == 0) continue;
			else {
				System.out.println("NO"); return;
			}
		}
		System.out.println("YES");
	}

}
