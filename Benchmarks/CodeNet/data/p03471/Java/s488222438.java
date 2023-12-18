import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // programming
        int n = getInputInteger(sc);
        int y = getInputInteger(sc);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        
        for (int i = 0; i <= n; i++) {
            n1 = i;
            n2 = 0;
            n3 = 0;
            if (10000 * n1 + 5000 * n2 + 1000 * n3 == y && n1 + n2 + n3 == n) {
                output(String.valueOf(n1), String.valueOf(n2), String.valueOf(n3));
                return;
            }
            for (int j = 0; j <= n - n1; j++) {
                n2 = j;
                int sum2 = 5000 * n2;
                if (10000 * n1 + 5000 * n2 + 1000 * n3 == y && n1 + n2 + n3 == n) {
                    output(String.valueOf(n1), String.valueOf(n2), String.valueOf(n3));
                    return;
                }
                for (int k = 0; k <= n - n1 - n2; k++) {
                    n3 = k;
                    int sum3 = 1000 * n3;
                    if (10000 * n1 + 5000 * n2 + 1000 * n3 == y && n1 + n2 + n3 == n) {
                        output(String.valueOf(n1), String.valueOf(n2), String.valueOf(n3));
                        return;
                    }
                }
            }
        }
        output("-1", "-1", "-1");
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

    public static int sum(int[] vals) {
        int sum = 0;
        for (int val : vals) {
            sum += val;
        }
        return sum;
    }

    public static int[] sort(int[] vals, boolean isAsc) {
        Arrays.sort(vals);
		if (isAsc) {
			return vals;
		}
        int[] ret = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            ret[vals.length - i - 1] = vals[i];
        }
		return ret;
	}
}