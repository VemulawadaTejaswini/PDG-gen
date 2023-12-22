import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    protected static String calc(String input) {
        final int[] intArray = split(input);

        Arrays.sort(intArray);

        StringBuffer sb = new StringBuffer();

        for (int i : intArray) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(i);
        }

        return sb.toString();
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ints = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ints[i] = Integer.parseInt(s0[i]);
        }

        return ints;
    }

    private static String readLine() {
        java.util.Scanner s = null;
        try {
            s = new java.util.Scanner(System.in);
            return s.nextLine();
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}