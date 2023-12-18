import java.util.*;
import java.lang.*;

class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int ans = Integer.MAX_VALUE;
        for(int i = 2; i < s.length(); i++) {
            int num = 0;
            num = num * 10 + (chars[i-2] - 48);
            num = num * 10 + (chars[i-1] - 48);
            num = num * 10 + (chars[i] - 48);
            ans = min(ans, (num > 753 ? num - 753 : 753 - num));
        }
        System.out.println(ans);
    }
  	static int min(int a, int b) {
    	return a < b ? a : b;
    }
}