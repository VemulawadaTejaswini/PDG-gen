import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // programming
        int x = Util.getInputInteger(sc);
        int y = Util.getInputInteger(sc);
        Util.output(String.valueOf(x+y/2));
	}
}

// =========common=========
class Util {
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

    public static int[] toIntegerList(String[] ss) {
        return Stream.of(ss).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] toList(String s) {
        String[] ret = s.split("");
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

    public static void gc() {
        System.gc();
    }
}