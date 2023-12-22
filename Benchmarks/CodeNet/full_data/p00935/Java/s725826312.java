import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] seq = new int[n];
		long ret = 0;
		HashMap<String, Integer> subseq = new HashMap<String, Integer>();
		String N = "";
		StringBuilder sb = new StringBuilder(N);
		for (int i = 0; i < seq.length; i++) {
			sb.append(in.next());
		}
		N = sb.toString();
		System.out.println(N);
		while(true) {
			String target =  String.valueOf(ret);//??\?????????????????????target???????????????long??????String??¨???
			int digit = target.length();
			int left = 0;
			int right = left + digit;
			while (right <= n) {
				String sub = N.substring(left, right);
				//System.out.println("sub : " + sub);
				if(!N.contains(target)){
					System.out.println(target);
					return;
				}
				left++;
				right++;
			}
			ret++;
		}
	}
}