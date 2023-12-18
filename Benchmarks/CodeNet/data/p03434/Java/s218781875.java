import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = getInputInteger(sc);
 
        // programming
        int[] a = new int[n];
        int half = (n+1) / 2;
        for (int i = 0; i < n; i++) {
            a[i] = getInputInteger(sc);
            if (i >= half) {
                a[i] *= -1;
            }
        }
        int sum = sum(a);
        output(String.valueOf(sum));
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
}