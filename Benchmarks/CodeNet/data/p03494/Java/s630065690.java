import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = getInputInteger(sc);
 
        // programming
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = getInputInteger(sc);
        }

        int count = 0;
        l1: while (true) {
            for (int i = 0; i < n; i++) {
                int v = a[i];
                if (v % 2 == 0) {
                    break l1;
                }
            }
            count++;
        }

        output(String.valueOf(count));
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