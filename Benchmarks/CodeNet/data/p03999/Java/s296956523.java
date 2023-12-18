
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String S = scan.next();

	int pattern = pow(2, S.length()-1);
	long ans = 0;
	for (int i = 0; i < pattern; i++) {
	    ans = ans + calc(S, i);
	}

	System.out.println(ans);
	scan.close();
    }

    private static long calc(String s, int value) {
	String t = Integer.toBinaryString(value);
	StringBuilder str = new StringBuilder();
	str.append(s.substring(0, s.length()-t.length()));
	for (int i = 0; i < t.length(); i++) {
	    if(t.charAt(i) == '1') str.append('+');
	    str.append(s.charAt(s.length() - t.length() + i));
	}

	long result = 0;
	long tmp = 0;
	for (int i = 0; i < str.length(); i++) {
	    if(str.charAt(i) == '+') {
		result = result + tmp;
		tmp = 0;
	    } else {
		tmp = tmp * 10 + str.charAt(i) - '0';
	    }
	}
	result = result + tmp;
	return result;
    }

    private static int pow(int x, int y) {
	if(y == 0) return 1;

	int x2 = pow(x, y/2);
	int result = x2 * x2;
	if(y % 2 != 0) result = result * x;
	return result;
    }
}
