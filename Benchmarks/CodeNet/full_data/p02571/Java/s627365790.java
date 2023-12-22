import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s = sc.next();
		String t = sc.next();
		
		int ans = 10000;
		if(s.equals(t)) {
			ans = 0;
		}
		for(int i = 0; i < s.length()-t.length()+1;i++) {
			int temp = 0;
			for(int j = 0; j < t.length(); j++) {
				if(s.charAt(i+j) != t.charAt(j)){
					++temp;
				}
			}
			if(ans > temp) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}
}

