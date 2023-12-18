import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = getInputInteger(sc);
		int b = getInputInteger(sc);
        int c = getInputInteger(sc);
        int x = getInputInteger(sc);
 
        // programming
        int result = 0;
        l1: for (int i = a; i >= 0; i--) {
            l2: for (int j = b; j >= 0; j--) {
                l3: for (int k = c; k >=0; k--) {
                    if (500*i + 100*j + 50*k == x) {
                        result++;
                    }
                }
            }
        }
        output(String.valueOf(result));
	}

	public static String getInputString(Scanner sc) {
		return sc.next();
	}

	public static int getInputInteger(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static void output(String... params) {
		boolean isInit = true;
		String str = "";
		for (String s : params) {
			if (!isInit) {
				str += " ";
			}
			str += s;
			isInit = false;
		}
		System.out.println(str);
	}

    public static int[] toIntegerList(String s) {
        int[] ret = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ret[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return ret;
    }
}